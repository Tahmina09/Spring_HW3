package com.example.seminar3.services;

import com.example.seminar3.domain.User;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void notifyUser(User user) {
        System.out.println("A new user is created " + user);
    }


}

