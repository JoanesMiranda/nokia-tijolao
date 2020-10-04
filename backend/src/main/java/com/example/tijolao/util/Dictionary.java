package com.example.tijolao.util;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    public Map<String, String[]> mapaLetters;

    public Dictionary() {
        this. mapaLetters = new HashMap<String, String[]>();
        mapaLetters.put("2", new String[]{"a","b","c"});
        mapaLetters.put("3", new String[]{"d","e","f"});
        mapaLetters.put("4", new String[]{"g","h","i"});
        mapaLetters.put("5", new String[]{"j","k","l"});
        mapaLetters.put("6", new String[]{"m","n","o"});
        mapaLetters.put("7", new String[]{"p","q","r","s"});
        mapaLetters.put("8", new String[]{"t","u","v"});
        mapaLetters.put("9", new String[]{"w","x","y","z"});
        mapaLetters.put("0", new String[]{" "});
        mapaLetters.put("1", null);
    }

   public  String[] getLetters(String key) {
       return mapaLetters.get(key);
   }
}
