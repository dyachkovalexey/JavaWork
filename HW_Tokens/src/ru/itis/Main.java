package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // считывание строки
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Tokenizer tokenizer = new SimpleTokenizerImpl();

        //разбитие строки на токены
        tokenizer.parse(text);
    }
}
