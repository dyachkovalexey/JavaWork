package ru.itis;

import jdk.nashorn.internal.parser.Token;

/**
 * Created by Lo0ny on 03.10.2016.
 */
public class Punctuations implements Tokenizer {
    @Override
    public String[] parse(String text) {
        return new String[0];
    }

    @Override
    public String whoI(String token) {
        String countText ="";
        for (int i = 0; i < token.length(); i++) {
            char c = token.charAt(i);

            //содержит ли токен знаки пунктуации?
            if (String.valueOf(c).matches("^[!,.?]+$"))
                countText = " - знак пунктуации" ;
            else
                countText = "";
        }
        return countText;
    }
}
