package com.bartekce.veganpower.user;

import com.bartekce.veganpower.cycle.Cycle;
import com.bartekce.veganpower.training.TrainingUnit;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class UserEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String password;
    private int maxPush_ups;
    @OneToMany
    List<Cycle> cycles;


    public UserEntity(String username, String password) {
        this.username = username;
        this.password = password;
        this.cycles = new ArrayList<>();
    }

    public void addCycles(Cycle cycle){
        List<Cycle> list = new ArrayList<>(this.cycles);
        list.add(cycle);
        setCycles(list);
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", maxPush_ups=" + maxPush_ups +
                ", cycles=" + cycles +
                '}';
    }
}
