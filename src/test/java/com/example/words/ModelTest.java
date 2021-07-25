package com.example.words;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {Model.class})
@ExtendWith(SpringExtension.class)
public class ModelTest {

    @Autowired
    private Model model;


    @Test
    public void testResult1(){
        List<String> example = new ArrayList<>(Arrays.asList("fish","horse","egg","goose","eagle"));
        List<String> res = new ArrayList<>(Arrays.asList("fish","horse","egg","goose","eagle"));
        Words words = new Words();
        Words result = new Words();
        words.getWords().addAll(example);
        result.getWords().addAll(res);
        assertEquals(result.getWords(),model.result(words).getWords());
    }

    @Test
    public void testResult2(){
        List<String> example = new ArrayList<>(Arrays.asList("fish","horse","snake","goose","eagle"));
        List<String> res = new ArrayList<>(Arrays.asList("fish","horse"));
        Words words = new Words();
        Words result = new Words();
        words.getWords().addAll(example);
        result.getWords().addAll(res);
        assertEquals(result.getWords(),model.result(words).getWords());
    }
    @Test
    public void testResult3(){
        List<String> example = new ArrayList<>(Arrays.asList("fish","horse","","goose","eagle"));
        List<String> res = new ArrayList<>(Arrays.asList("fish","horse"));
        Words words = new Words();
        Words result = new Words();
        words.getWords().addAll(example);
        result.getWords().addAll(res);
        assertEquals(result.getWords(),model.result(words).getWords());
    }
    @Test
    public void testResult4(){
        List<String> example = new ArrayList<>(Arrays.asList("","horse","","goose","eagle"));
        Words words = new Words();
        Words result = new Words();
        words.getWords().addAll(example);
        assertEquals(result.getWords(),model.result(words).getWords());
    }

}

