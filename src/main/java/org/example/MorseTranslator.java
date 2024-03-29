package org.example;

import java.util.HashMap;
import java.util.Locale;

public class MorseTranslator {

    private HashMap<Character, String> alphabet = new HashMap<>();

    public MorseTranslator() {
        alphabet.put(' ', "/");
        alphabet.put('A', ".-");
        alphabet.put('B', "-...");
        alphabet.put('C', "-.-.");
        alphabet.put('D', "-..");
        alphabet.put('E', ".");
        alphabet.put('F', "..-.");
        alphabet.put('G', "--.");
        alphabet.put('H', "....");
        alphabet.put('I', "..");
        alphabet.put('J', ".---");
        alphabet.put('K', "-.-");
        alphabet.put('L', ".-..");
        alphabet.put('M', "--");
        alphabet.put('N', "-.");
        alphabet.put('O', "---");
        alphabet.put('P', ".--.");
        alphabet.put('Q', "--.-");
        alphabet.put('R', ".-.");
        alphabet.put('S', "...");
        alphabet.put('T', "-");
        alphabet.put('U', "..-");
        alphabet.put('V', "...-");
        alphabet.put('W', ".--");
        alphabet.put('X', "-..-");
        alphabet.put('Y', "-.--");
        alphabet.put('Z', "--..");
    }

    public String translateToMorse(String englishSentence) {
        String translatedSentence = "";
        for (int i = 0; i < englishSentence.length(); i++) {
            translatedSentence += alphabet.get(englishSentence.toUpperCase().charAt(i));
        }
        return translatedSentence;
    }
}
