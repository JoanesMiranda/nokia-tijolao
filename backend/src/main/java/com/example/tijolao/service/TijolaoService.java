package com.example.tijolao.service;

import java.util.HashMap;
import java.util.Map;

import com.example.tijolao.util.Dictionary;

import org.springframework.stereotype.Service;

@Service
public class TijolaoService {

	public String getMessage(String key, int count) {
        String[] letters  = getLetters(key);
        return letters[count-1];
    }
    
    private String[] getLetters(String key) {
        Dictionary dictionary = new Dictionary();
        return dictionary.getLetters(key);
    }
}
