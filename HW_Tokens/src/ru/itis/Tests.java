package ru.itis;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Lo0ny on 04.10.2016.
 */
public class Tests {

    Tokenizer words = new Words();
    Tokenizer numbers = new Numbers();
    Tokenizer punctuations = new Punctuations();
    SimpleTokenizerImpl sti = new SimpleTokenizerImpl();
    String testTkn[];
    String testText;

    @Before
    public void setUp() throws Exception {
        this.testText = "Hello, World 1";
        this.testTkn = new String[]{"Hello", ",", "World", "1"};//sti.tokenizer.parse(test);
    }


    @Test
    public void testParse() throws Exception {
        String expected[] = {"Hello", ",", "World", "1"};
        String actual[] = tokenizer.parse(this.testText);

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }


    @Test
    public void testPunctuationWhoI() throws Exception {
        String expected = " - знак пунктуации";
        String actual = punctuations.whoI(testTkn[1]);

        assertEquals(expected, actual);
    }


    @Test
    public void testNumbersWhoI() throws Exception {
        String expected = " - число";
        String actual = numbers.whoI(testTkn[3]);

        assertEquals(expected, actual);
    }

    @Test
    public void testWordsWhoI() throws Exception {
        String expected = " - слово";
        String actual = words.whoI(testTkn[0]);

        assertEquals(expected, actual);
    }

}