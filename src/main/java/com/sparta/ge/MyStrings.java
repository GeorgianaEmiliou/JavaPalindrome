package com.sparta.ge;

public class MyStrings {
    public void sayHello(){
        System.out.println("Hello");
    }

    public static boolean checkIfLetterExists(String strIn, String strSearch){
        return strSearch.contains(strIn);
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
