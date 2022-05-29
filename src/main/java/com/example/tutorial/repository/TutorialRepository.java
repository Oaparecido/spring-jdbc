package com.example.tutorial.repository;

import com.example.tutorial.model.TutorialModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TutorialRepository {

    public List<TutorialModel> getTutorial() {
        TutorialModel model = new TutorialModel();

        model.setTitle("Title Example");
        model.setDescription("Description Example");
        List<TutorialModel> tutorials = new ArrayList<>();
        tutorials.add(model);
        return tutorials;
    }
}
