package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // считывание строки
        Scanner inp = new Scanner(System.in);
        String text = inp.nextLine();
        SimpleTokenizerImpl sti = new SimpleTokenizerImpl();

        Tokenizer words = new Words();
        Tokenizer numbers = new Numbers();
        Tokenizer punctuations = new Punctuations();

        //разбитие строки на токены
        String tkn[] = sti.tokenizer.parse(text);


        //определение типа токенов и вывод на экран
        for (int i = 0; i <= sti.count; i++) {
            text ="";

            text += words.whoI(tkn[i]);
            text += numbers.whoI(tkn[i]);
            text += punctuations.whoI(tkn[i]);

            tkn[i] += text;
            System.out.println(tkn[i]);
        }
        }
}
