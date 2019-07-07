package ru.mk.controllers.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mk.controllers.model.Role;

public interface RoleDao extends JpaRepository<Role, Long>{
}
