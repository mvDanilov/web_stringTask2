package com.epam.mv.entity;

import java.util.ArrayList;
import java.util.List;

public class Sentence extends CompoundText<Word> {

    public Sentence(List<Word> components) {
        super(components);
    }
    public List<Word>getListWord(){
        return components;
    }

    @Override
    public String toString() {
        String result = "   ";
        for (Word word : components) {
            result += word.toString();
        }
        return result;
    }
}


