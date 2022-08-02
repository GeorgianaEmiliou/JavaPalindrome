package com.sparta.ge;
public class Main
{
    public static void main( String[] args ) {

        //String s = "ABCDE";
        //String newS = "";
        MyStrings stringy = new MyStrings();
        //stringy.sayHello();
        //System.out.println(stringy.checkIfLetterExists("i", "Hi"));

        /*System.out.println("Ascending order: ");
        for(int i=0; i<s.length();i++){
            System.out.print(s.charAt(i));
        }

        System.out.println();*/

        System.out.println("Reverse word: " + stringy.reverse("word"));

        //System.out.println(stringy.isPalindrome("noon"));

    }
}
