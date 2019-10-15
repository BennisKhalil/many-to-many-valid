package com.example.demomany2;

import com.example.demomany2.Entity.Bot;
import com.example.demomany2.Entity.Role;
import com.example.demomany2.Entity.User;
import com.example.demomany2.Repo.BotRepo;
import com.example.demomany2.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demomany2Application implements CommandLineRunner {

    @Autowired
    private BotRepo botRepo;

    @Autowired
    private UserRepo userRepo;
    public static void main(String[] args) {
        SpringApplication.run(Demomany2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Bot bot = Bot.builder().botName("botname").build();
        botRepo.save(bot);
        Role role = Role.builder().bot(bot).dummyName("testRole").build();
        User user = new User(null,"username", role);
        userRepo.save(user);



    }
}
