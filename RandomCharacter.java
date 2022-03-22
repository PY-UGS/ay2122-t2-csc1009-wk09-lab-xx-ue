package com.company;
import java.util.Random;
public class RandomCharacter {

    // write your code here
    public static char getRandomLowerCaseLetter() {
        char lowerCase;
        Random random = new Random();
        lowerCase = (char) (random.nextInt(26) + 'a');
        return lowerCase;
    }

    public static char getRandomUpperCaseLetter() {
        char upperCase;
        Random random = new Random();
        upperCase = (char) (random.nextInt(26) + 'A');
        return upperCase;

    }

    public static char getRandomDigitCharacter() {
        char digitCharacter;
        Random random = new Random();
        digitCharacter = (char) (random.nextInt(10) + '0');
        return digitCharacter;
    }

    public static char getRandomCharacter() {
        char randomChar = 0;
        int randomGenerator;
        Random random = new Random();
        randomGenerator = (random.nextInt(3));
        if (randomGenerator == 0) {
            randomChar = RandomCharacter.getRandomLowerCaseLetter();
        }
        if (randomGenerator == 1) {
            randomChar = RandomCharacter.getRandomUpperCaseLetter();
        }
        if (randomGenerator == 2) {
            randomChar = RandomCharacter.getRandomDigitCharacter();
        }
        return randomChar;
    }

    public static void main(String[] args) {


        RandomCharacter randChar = new RandomCharacter();
        System.out.println("Generate fifteen random characters in random lower case character between ‘a’ and ‘z’.");
        for (int i = 0; i < 15; i++) {
            System.out.print(randChar.getRandomLowerCaseLetter() + " ");
        }

        System.out.println("\nGenerate fifteen random characters in random upper case character between ‘A’ and ‘Z’.");
        for (int i = 0; i < 15; i++) {
            System.out.print(randChar.getRandomUpperCaseLetter() + " ");
        }

        System.out.println("\nGenerate fifteen random characters in random digit number between ‘0’ and ‘9’.");
        for (int i = 0; i < 15; i++) {
            System.out.print(randChar.getRandomDigitCharacter() + " ");
        }
        System.out.println("\nGenerate fifteen random characters.");
        for (int i = 0; i < 15; i++) {
            System.out.print(randChar.getRandomCharacter() + " ");
        }
        System.out.print("\n");
    }
}

