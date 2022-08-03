package com.sparta.ge;

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        String sentence = "The wow the paper and the noon the rotator";

        System.out.println("The longest palindrome word in the sentence is: " + (returnTheLongestPalindromeWord(sentence)));

    }

    public static String returnTheLongestPalindromeWord(String sentence){
        String[] allWords = sentence.split(" ");
        int countOfPalindrome = 0;
        for(String word : allWords){
            if(isPalindrome(word)){
                countOfPalindrome++;
            }
        }
        int count = 0;
        String[] palindromeWords = new String[countOfPalindrome];
        for(String word : allWords){
            if(isPalindrome(word)){
                palindromeWords[count] = word;
                count++;
            }
        }
        String newPalindrome = "";
        String longestWord = palindromeWords[0];
        for(int i =0 ; i< palindromeWords.length; i++){
            if(palindromeWords[i].length() > longestWord.length()){
                longestWord = palindromeWords[i];
            }
            /*if(palindromeWords[i].length() == longestWord.length()){
                newPalindrome = palindromeWords[i] + " and " + longestWord;
            }*/
        }
        /*if(newPalindrome.length() > longestWord.length()){
            return newPalindrome;
        }*/
        return longestWord;
    }

    public static String reverse(String word){
        String reverseWord = "";
        for(int i=word.length()-1; i>=0; i--){
            reverseWord = reverseWord + word.charAt(i);
        }
        return reverseWord;
    }

    public static boolean isPalindrome(String word){
        return word.equals(reverse(word));
    }
}

