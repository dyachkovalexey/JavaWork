package ru.itis;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by KFU-user on 30.09.2016.
 */
public class IntegerArrayListTest {

    IntegerArrayList testedList;

    @Test
    public void add() throws Exception {
        int expected = 5;
        testedList.add(9);
        int ectual = testedList.find(9);

        assertEquals(expected, ectual);
    }

    @Test
    public void add1() throws Exception {

        int expected = 3;
        testedList.add(9, 3);
        int ectual = testedList.find(9);

        assertEquals(expected, ectual);
    }

    @Test
    public void delete() throws Exception {
        boolean expected = true;
        boolean ectual = testedList.delete(12);

        assertEquals(expected, ectual);
    }

    @Test
    public void deleteByPosition() throws Exception {
        int expected = 0;
        testedList.deleteByPosition(0);
        int ectual = testedList.find(5);

        assertEquals(expected, ectual);
    }

    @Test
    public void find() throws Exception {
        int expected = 0;
        int ectual = testedList.find(2);

        assertEquals(expected, ectual);
    }

    //запускаться перед каждым тестом
    @Before
    public void setUp() throws Exception {

        int testData[] = {2, 5, 3, 4, 8};
        testedList = new IntegerArrayList(testData);
    }

    // тестируем метод get
    @Test
    public void testGetCorrectData() throws Exception {
        int expected = 3;
        int ectual = testedList.get(2);

        assertEquals(expected, ectual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetUncorrectData() throws Exception {
        int expected = 3;
        int ectual = testedList.get(10);

        assertEquals(expected, ectual);
    }
}