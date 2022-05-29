package com.example.tutorial;

import com.example.tutorial.model.TutorialModel;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class TutorialApplicationTests {

    @Test
    void create() {
        RestTemplate template = new RestTemplate();

        TutorialModel model = new TutorialModel();
        model.setTitle("Title Example");
        model.setDescription("Description Example...");

        template.put("localhost:8080/tutorial", model);
    }

}
