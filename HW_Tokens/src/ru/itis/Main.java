package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // считывание строки
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Tokenizer tokenizer = new SimpleTokenizerImpl();

        Tokenizer words = new Words();
        Tokenizer numbers = new Numbers();
        Tokenizer punctuations = new Punctuations();

        //разбитие строки на токены
        String tkn[] = tokenizer.parse(text);


        //TODO: раскидать реализации по классам
        //определение типа токенов и вывод на экран
        for (int i = 0; i <= tokenizer.count; i++) {
            text ="";

            text += words.whoI(tkn[i]);
            text += numbers.whoI(tkn[i]);
            text += punctuations.whoI(tkn[i]);

            tkn[i] += text;
            System.out.println(tkn[i]);
        }
    }
}
