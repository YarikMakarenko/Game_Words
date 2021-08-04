package com.example.words.controller;

import com.example.words.model.Model;
import com.example.words.Words;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("words")
public class WordsController {

    private final Model model = new Model();


    @PostMapping
    public Words newWords(@RequestBody Words json){
        return model.result(json);
    }

}
