package com.example.tutorial.repository;

import com.example.tutorial.model.TutorialModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TutorialRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<TutorialModel> getTutorial() {
        TutorialModel model = new TutorialModel();

        model.setTitle("Title Example");
        model.setDescription("Description Example");
        List<TutorialModel> tutorials = new ArrayList<>();
        tutorials.add(model);
        return tutorials;
    }

    public TutorialModel create(TutorialModel model) {
        jdbcTemplate.update(
                "insert into tutorial_table (title, description) values (?,?)",
                model.getTitle(),
                model.getDescription()
        );

        return null;
    }
}
