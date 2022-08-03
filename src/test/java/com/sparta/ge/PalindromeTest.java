package com.sparta.ge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

    @Test
    @DisplayName("Give a sentence and return the longest palindrome word")
    public void returnLongestPalindrome(){
        String input = "Noon, word, repaper";
        String expectedAnswer = "repaper";
        String answer = Palindrome.returnTheLongestPalindromeWord(input);
        Assertions.assertEquals(expectedAnswer, answer);
    }
}
