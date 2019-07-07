package ru.mk.controllers.service;

public interface SecurityService {
    String findLoggedInUsername();
    void autoLogin(String username, String password);
}
