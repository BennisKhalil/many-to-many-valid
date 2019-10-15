package com.example.demomany2.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "user_bot")
public class Role implements Serializable {

    @Id
    @ManyToOne
    @JsonIgnore
    private Bot bot;

    @Id
    @ManyToOne
    @JsonIgnore
    private User user;

    private String dummyName;

    @Override
    public String toString() {
        return "Role{" +
                "bot=" + bot +
                ", dummyName='" + dummyName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return Objects.equals(bot, role.bot) &&
                Objects.equals(user, role.user) &&
                Objects.equals(dummyName, role.dummyName);
    }

    @Override
    public int hashCode() {
        System.out.println(user);
        return Objects.hash(bot.getId(),user.getId(), dummyName);
    }
}
