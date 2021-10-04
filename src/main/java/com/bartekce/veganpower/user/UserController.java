package com.bartekce.veganpower.user;

import com.bartekce.veganpower.cycle.Cycle;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user/create")
    public UserEntity createUser(@RequestBody UserDto userDto) {
        return userService.createUser(userDto);
    }

    @PostMapping("/user/planTraining")
    public UserEntity planTraining(@RequestBody UserDto userDto) {
        return userService.planTrainings(userDto);
    }

    @GetMapping("/user/whatToDo")
    public List<Cycle> getUser(@RequestBody UserDto userDto) {
        return userService.getUser(userDto.getUsername());
    }

    @PostMapping("/user/login")
    public String login(@RequestBody UserDto userDto) {
        return userService.login(userDto);
    }
}
