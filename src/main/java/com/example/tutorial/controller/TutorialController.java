package com.example.tutorial.controller;

import com.example.tutorial.model.TutorialModel;
import com.example.tutorial.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public @ResponseBody TutorialModel create(@RequestBody TutorialModel model) {
        return service.create(model);
    }
}
