package com.example.seminar3.services;

import com.example.seminar3.domain.User;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void notifyUser(User user, String message) {
        System.out.println(message + user);
    }


}


