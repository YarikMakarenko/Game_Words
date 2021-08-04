package com.example.words.model;

import com.example.words.Words;
import org.springframework.stereotype.Service;

@Service
public class Model {

    public Words result(Words json) {
        Words words = new Words();
        char last;
        char first;
        if (!json.getWords().get(0).isEmpty()) {
            words.getWords().add(json.getWords().get(0));
            for (int i = 1; i <= json.getWords().size()-1; i++) {
                if (json.getWords().get(i).isEmpty()) {
                    break;
                }
                last = json.getWords().get(i - 1).charAt(json.getWords().get(i - 1).length() - 1);
                first = json.getWords().get(i).charAt(0);
                if (last == first) {
                    words.getWords().add(json.getWords().get(i));
                } else {
                    break;
                }
            }
        }
        return words;
    }
}

