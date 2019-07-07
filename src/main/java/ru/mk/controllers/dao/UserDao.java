package ru.mk.controllers.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mk.controllers.model.User;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
