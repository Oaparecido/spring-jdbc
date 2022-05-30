package com.example.tutorial.repository;

import com.example.tutorial.model.TutorialModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public Number create(TutorialModel model) {

        SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);

        List<String> columns = new ArrayList<>();
        columns.add("Title");
        columns.add("Description");

        insert.setTableName("tutorial_table");
        insert.setColumnNames(columns);

        Map<String, Object> data = new HashMap<>();
        data.put("title", model.getTitle());
        data.put("description", model.getDescription());

        Number key = insert.executeAndReturnKey(data);


        return key;
    }
}
