package com.example.tutorial.service;

import com.example.tutorial.model.TutorialModel;
import com.example.tutorial.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorialService {

    @Autowired
    private TutorialRepository repository;

    public List<TutorialModel> getTutorials() {
        return repository.getTutorial();
    }

    public Number create(TutorialModel model) {
        return repository.create(model);
    }
}
