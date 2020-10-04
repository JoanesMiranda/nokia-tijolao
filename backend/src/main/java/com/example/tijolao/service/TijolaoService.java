package com.example.tijolao.service;

import com.example.tijolao.util.Dictionary;

import org.springframework.stereotype.Service;

@Service
public class TijolaoService {

    public String getMessage(String key, int count) {
        if (key.equals("1")) {
            return null;
        }
        return key.equals("0") ? getLetters(key)[0] : getLetters(key)[count - 1];

    }

    private String[] getLetters(String key) {
        Dictionary dictionary = new Dictionary();
        return dictionary.getLetters(key);
    }
}
