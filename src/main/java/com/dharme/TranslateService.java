package com.dharme;


import java.util.HashMap;
import java.util.Map;

public class TranslateService {
    private Map<String, String> dictionary = new HashMap<>();
    public TranslateService() {
        initDict();
    }

    private void initDict() {
        dictionary.put("hello", "Bonjour");
        dictionary.put("yes", "Qui");
        dictionary.put("no", "Non");
        dictionary.put("goodbye", "Au revior");
        dictionary.put("good night", "Bonne nuit");
        dictionary.put("thank you", "Merci");
    }

    public String translate(String text) {
        if(text == null || text.trim().isEmpty()) {
            throw new IllegalArgumentException("Text must be not empty");
        }
        return englishToFrench(text);
    }

    private String englishToFrench(String text) {
        String textLowerCase = text.toLowerCase();
        return dictionary.getOrDefault(textLowerCase, "Not found");
    }
}
