package org.example.service;

import org.example.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationService {

    private final UserDAO userDAO;

    @Autowired
    public UserRegistrationService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public boolean isUserExist(String login) {
       return userDAO.isUserExist(login);
    }
}
