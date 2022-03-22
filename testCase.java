package com.company;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static  org.junit.Assert.*;

public class testCase {
    @Test
    public void testGetRandomLowerCaseLetter() {
        char test_data = RandomCharacter.getRandomLowerCaseLetter();
        char test_data2 = RandomCharacter.getRandomLowerCaseLetter();

        // check value
        assertTrue(test_data >= 'a' & test_data <= 'z');
        assertTrue(test_data2 >= 'a' & test_data2 <= 'z');
        // check random
        assertNotEquals(test_data, test_data2);
    }

    @Test
    public void testGetRandomUpperCaseLetter() {
        char test_data = RandomCharacter.getRandomUpperCaseLetter();
        char test_data2 = RandomCharacter.getRandomUpperCaseLetter();

        // check value
        assertTrue(test_data >= 'A' & test_data <= 'Z');
        assertTrue(test_data2 >= 'A' & test_data2 <= 'Z');
        // check random
        assertNotEquals(test_data, test_data2);
    }

    @Test
    public void testGetRandomDigitCharacter() {
        char test_data = RandomCharacter.getRandomDigitCharacter();
        char test_data2 = RandomCharacter.getRandomDigitCharacter();

        // check value
        assertTrue(test_data >= '0' & test_data <= '9');
        assertTrue(test_data2 >= '0' & test_data2 <= '9');
        // check random
        assertNotEquals(test_data, test_data2);
    }

    @Test
    public void testGetRandomCharacter() {
        char[] test_data = {RandomCharacter.getRandomDigitCharacter(),
                RandomCharacter.getRandomDigitCharacter()};

        // check value
        for (char test: test_data) {
            boolean condition1 = (test >= '0' & test <= '9');
            boolean condition2 = (test >= 'A' & test <= 'Z');
            boolean condition3 = (test >= 'a' & test <= 'z');
            assertTrue((condition1 || condition2 || condition3));
        }

        // check random
        assertNotEquals(test_data[0], test_data[1]);
    }

    @Test
    public void testPrime() {
        char test = RandomCharacter.getRandomDigitCharacter();
        int test_data_P=Character.digit(test,10);
        boolean flag = true;
        for (int i = 2; i <= test_data_P / 2; ++i) {
            // condition for nonprime number
            if(i==0){
                flag=false;
            }
            if (test_data_P % i == 0) {
                flag = false;
                break;
            }
        }
        assertTrue(flag);
    }


    public static void main(String[] args) {

        Result result = JUnitCore.runClasses(testCase.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }

}