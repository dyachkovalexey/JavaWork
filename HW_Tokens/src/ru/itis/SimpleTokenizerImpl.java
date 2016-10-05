package ru.itis;

/**
 * Created by Lo0ny on 03.10.2016.
 */
public class SimpleTokenizerImpl implements Tokenizer {

        @Override
        public String[] parse(String text) {
                int count = 0;
                count = 0;
                String mass[] = new String[text. length()];
                char c;
                for (int i = 0; i < text.length(); i++) {
                        c = text.charAt(i);
                        if (c != ' ') { //проверка на конец токена
                                if (String.valueOf(c).matches("^[!,.?]+$")) { // проверка на знаки препинания
                                        count++;
                                        //TODO: сюда пихнуть проверка на типы
                                        mass[count] = String.valueOf(c);
                                } else
                                if (mass[count] == null)
                                        mass[count] = String.valueOf(c);
                                else
                                        mass[count] += String.valueOf(c);
                        } else count++;
                }
                return mass;
        }

        @Override
        public String whoI(String token) {
                return "";
        }
}
