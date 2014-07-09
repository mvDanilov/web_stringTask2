package com.epam.mv.parser;

import com.epam.mv.entity.Char;
import com.epam.mv.entity.Paragraph;
import com.epam.mv.entity.Sentence;
import com.epam.mv.entity.Word;
import org.w3c.dom.*;

import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.Text;
import java.util.ArrayList;
import java.util.List;

public class Parser {

    public Text parseText(String originalString) {
        String[] arrayParagraphs = originalString.split("\n");
        List<Paragraph> paragraphs = new ArrayList<>();
        for (String Paragraph : arrayParagraphs) {
            List<Char> chars = parseToChars(Paragraph);
            List<Word> words = parseToWord();
            List<Sentence> sentence = parseToSentence();

            paragraphs.add(new Paragraph(sentence));

        }

    }

    private List<Sentence> parseToSentence() {
        return null;
    }

    private List<Word> parseToWord() {
    }

    private List<Char> parseToChars(String paragraph) {
    }


}

