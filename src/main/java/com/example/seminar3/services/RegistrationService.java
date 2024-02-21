package com.example.seminar3.services;

import com.example.seminar3.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    @Autowired
    private DataProcessingService dataProcessingService;

    @Autowired
    private UserService userService;

    @Autowired
    private NotificationService notificationService;

    public DataProcessingService getDataProcessingService() {
        return dataProcessingService;
    }

    public void setDataProcessingService(DataProcessingService dataProcessingService) {
        this.dataProcessingService = dataProcessingService;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void processRegistration(User user) {
        dataProcessingService.getRepository().getUsers().add(userService.createUser(user));
        notificationService.notifyUser(user, "User added to DataBase.");
    }
}
