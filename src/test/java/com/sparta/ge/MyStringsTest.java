package com.sparta.ge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MyStringsTest {
    @Test
    @DisplayName("Given a word and reverse it")
    public void reverse(){
        String word = "word";
        String expectedAnswer = "drow";
        String answer = MyStrings.reverse(word);
        Assertions.assertEquals(expectedAnswer, answer);

    }

    @Test
    @DisplayName("Given a word and check if it is palindrome")
    public void checkIfIsPalindrome(){
        String word = "noon";
        boolean expectedAnswer = true;
        boolean answer = MyStrings.isPalindrome(word);
        Assertions.assertEquals(expectedAnswer, answer);
    }

    @Test
    @DisplayName("Given a word and check if it is palindrome")
    public void checkIfAGivenWordIsPalindrome(){
        String word = "word";
        boolean expectedAnswer = false;
        boolean answer = MyStrings.isPalindrome(word);
        Assertions.assertEquals(expectedAnswer, answer);
    }
}
