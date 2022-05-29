package com.example.tutorial.controller;

import com.example.tutorial.model.TutorialModel;
import com.example.tutorial.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tutorial")
public class TutorialController {

    @Autowired
    private TutorialService service;

    @GetMapping
    public List<TutorialModel> get() {
        return service.getTutorials();
    }
}
