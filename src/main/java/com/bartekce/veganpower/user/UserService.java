package com.bartekce.veganpower.user;

import com.bartekce.veganpower.cycle.Cycle;
import com.bartekce.veganpower.cycle.CycleService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final CycleService cycleService;

    public UserService(UserRepository userRepository, CycleService cycleService) {
        this.userRepository = userRepository;
        this.cycleService = cycleService;
    }

    public UserEntity createUser(UserDto user) {
        Optional<UserEntity> userInDB = findByUsername(user.getUsername());
        if (userInDB.isEmpty()) {
            return userRepository.save(new UserEntity(user.getUsername(), encodePassword(user.getPassword())));
        } else  throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
                String.format("User with this login: %s already exists", user.getUsername()));
    }


    public UserEntity planTrainings(UserDto userDto) {
        UserEntity user = userRepository.findByUsername(userDto.getUsername()).get();
        user.setMaxPush_ups(userDto.getMaxPushUps());
        user.addCycles(cycleService.addCycle(user));
        return userRepository.save(user);
    }

    public String encodePassword(String password) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.encode(password);
    }

    public Optional<UserEntity> findByUsername(String username){
        return userRepository.findByUsername(username);
    }

    public List<Cycle> getUser(String username) {
        return userRepository.findByUsername(username).get().cycles;
    }

    public String login(UserDto userDto) {
        Optional<UserEntity> existedUser = findByUsername(userDto.getUsername());
        if(existedUser.isPresent()) {
           if(checkIfCorrectPassword(userDto.getPassword(), existedUser.get().getPassword())) {
               return "You are in!";
           }
           else throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Incorrect login details");
        }
        else throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                "Incorrect login details, user with login: " + userDto.getUsername() + "doesn't exist");
    }

        private boolean checkIfCorrectPassword(String password, String passwordInDB) {
            try {
                return BCrypt.checkpw(password, passwordInDB);
            }catch (Exception e){
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Incorrect password details");
            }
    }

}
