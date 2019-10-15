package com.example.demomany2.Entity;

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
@Table(name="bot")
public class Bot {

    @Id
    @GeneratedValue
    private Integer id;
    private String botName;
    @OneToMany(cascade = CascadeType.PERSIST)
    @JsonIgnore
    private Set<Role> roles = new HashSet<>(0);

    @Override
    public String toString() {
        return "Bot{" +
                "id=" + id +
                ", botName='" + botName + '\'' +
                '}';
    }
}
