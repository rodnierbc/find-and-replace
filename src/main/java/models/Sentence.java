package models;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Sentence {
    private String sentence;

    public Sentence(String sentence){
        this.sentence = sentence;
    }

    public String findAndReplace(String find, String replace){
        String newSentence = "";
        String[] sentenceArray = sentence.split(" ");
        for (int i = 0; i< sentenceArray.length; i++) {
            if (sentenceArray[i].equals(find)) {
                sentenceArray[i] = replace;
            }
        }
        for (String word: sentenceArray) {
            newSentence = newSentence.concat(" ").concat(word);
        }
        return newSentence;
    }
}
