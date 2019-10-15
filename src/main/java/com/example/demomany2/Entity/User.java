package com.example.demomany2.Entity;

import com.example.demomany2.Entity.Role;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="platform_user")
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String userName;
    @OneToMany(cascade = CascadeType.PERSIST)
    @JsonIgnore
    private Set<Role> intermediateTable = new HashSet<>(0);

    public User(String id, String userName, Role role){
        this.userName = userName;

        role.setUser(this);

        this.intermediateTable.add(role);

    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", intermediateTable=" + intermediateTable +
                '}';
    }
}
