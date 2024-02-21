package com.example.seminar3.services;

import com.example.seminar3.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private NotificationService notification;

    public UserService(NotificationService notification) {
        this.notification = notification;
    }

    public User createUser(User user) {
        notification.notifyUser(user, "User is created!" + user);

        return user;
    }
}
