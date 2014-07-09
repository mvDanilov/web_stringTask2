package com.epam.mv.entity;


import java.util.List;

public class Paragraph extends CompoundText<Sentence>{

    public Paragraph(List<Sentence> components) {
        super(components);
    }

    public List<Sentence> getListSentences() {
        return components;
    }

    @Override
    public String toString() {
        String result = "    ";
        for (Sentence sentence : components) {
            result += sentence.toString();
        }
        return result;
    }

}