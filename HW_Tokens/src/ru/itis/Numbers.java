package ru.itis;

import jdk.nashorn.internal.parser.Token;

/**
 * Created by Lo0ny on 03.10.2016.
 */
public class Numbers implements Tokenizer {

    @Override
    public void parse(String text) {

    }

    @Override
    public String whoI(String token) {
        String countText ="";
        for (int i = 0; i < token.length(); i++) {
            char c = token.charAt(i);

            //содержит ли токен числа?
            if (String.valueOf(c).matches("^[0-9]+$"))
                countText = " - число";
            else
                countText = "";
        }
        return countText;
    }
}
