package ru.itis;

/**
 * Created by Lo0ny on 03.10.2016.
 */
public class Words implements Tokenizer {
    @Override
    public void parse(String text) {

    }


    @Override
    public String whoI(String token) {
        String countText ="";
        for (int i = 0; i < token.length(); i++) {
            char c = token.charAt(i);

            //содержит ли токен буквы?
            if (String.valueOf(c).matches("^[а-яА-Яa-zA-Z]+$"))
                countText = " - слово";
            else
                countText = "";
        }
        return countText;
    }
}
