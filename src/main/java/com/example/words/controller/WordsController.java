package com.example.words.controller;

import com.example.words.Model;
import com.example.words.Words;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("words")
public class WordsController {

    @Autowired
    private Model model;


    @PostMapping
    public Words newWords(@RequestBody Words json){
        return model.result(json);
    }

}
