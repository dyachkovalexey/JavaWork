package ru.itis;


/**
 * Created by Lo0ny on 03.10.2016.
 */
public class SimpleTokenizerImpl implements Tokenizer {

        Tokenizer words = new Words();
        Tokenizer numbers = new Numbers();
        Tokenizer punctuations = new Punctuations();

        /**
         * разбиение текста на токены и определение их типа
         * @param text - входной текст
         */
        @Override
        public void parse(String text) {
                int count = 0;
                count = 0;
                String mass[] = new String[text. length()];
                char c;
                for (int i = 0; i < text.length(); i++) {
                        c = text.charAt(i);
                        if (c != ' ') { //проверка на конец токена
                                if (String.valueOf(c).matches("^[!,.?]+$")) { // проверка на знаки препинания
                                        System.out.println(mass[count]+= getTokenType(mass[count]));
                                        count++;
                                        //TODO: сюда пихнуть проверка на типы
                                        mass[count] = String.valueOf(c);
                                } else
                                if (mass[count] == null)
                                        mass[count] = String.valueOf(c);
                                else
                                        mass[count] += String.valueOf(c);
                        } else {
                                System.out.println(mass[count]+= getTokenType(mass[count]));
                                count++;
                        }
                }
                System.out.println(mass[count]+= getTokenType(mass[count]));
        }


        /**
         * Получает тип токена
         * @param token - токен, подаваемый на вход
         * @return тип токена из перечисления
         */
        private String getTokenType(String token) {
                String countText ="";

                countText += words.whoI(token);
                countText += numbers.whoI(token);
                countText += punctuations.whoI(token);
                return countText;
        }

        /**
         * Получает тип символа
         * @param c - анализируемый символ
         * @return тип символа из перечисления
         */
        private Tokens getCharType(char c) {
                if (Character.isLetter(c)) {
                        return Tokens.WORD;
                } else if (Character.isDigit(c)) {
                        return Tokens.NUMBER;
                } else if (Character.isWhitespace(c)) {
                        return Tokens.WHITESPACE;
                } else return Tokens.PUNCTUATION;
        }

        @Override
        public String whoI(String token) {
                return "";
        }
}
