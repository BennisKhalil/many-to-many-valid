package com.example.demomany2.Repo;

import com.example.demomany2.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {
}
