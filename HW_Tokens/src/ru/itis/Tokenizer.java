package ru.itis;

/**
 * Created by Lo0ny on 03.10.2016.
 */
public interface Tokenizer {
    String[] parse(String text);
    String whoI(String token);
}
