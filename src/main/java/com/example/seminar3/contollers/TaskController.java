package com.example.seminar3.contollers;

import com.example.seminar3.domain.User;
import com.example.seminar3.services.DataProcessingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    private DataProcessingService service;

    @GetMapping
    public List<String> getAllTasks() {
        List<String> tasks = new ArrayList<>();
        tasks.add("sort");
        tasks.add("filter");
        tasks.add("calculate");

        return tasks;
    }

    @GetMapping("/sort")
    public List<User> sortByAge() {
        return service.sortUsersByAge(service.getRepository().getUsers());
    }

    @GetMapping("/filter/{age}")
    public List<User> filterByAge(@PathVariable("age") Integer age) {
        return service.filterUsersByAge(service.getRepository().getUsers(), age);
    }

    @GetMapping("/calc")
    public Double averageAges() {
        return service.calculateAverageAge(service.getRepository().getUsers());
    }
}
