package Abhishek;

import java.util.Locale;
import java.util.Scanner;

public class Palindrome {
    static void checkPalindrome(String word){
        word = word.toLowerCase(Locale.ROOT);
        StringBuilder newWord = new StringBuilder();
        char letter;
        for (int i = 0; i < word.length(); i++) {
            letter = word.charAt(i);
            newWord.insert(0, letter);
        }
        if (newWord.toString().equals(word)){
            System.out.println("\nString is Palindrome.");
        } else {
            System.out.println("\nString is not Palindrome.");
        }
    }
    static void checkPalindrome(int num){
        int newNum = 0;
        int duplicateNum = num;
        while (num != 0){
            newNum = ((newNum*10)+(num%10));
            num = num/10;
        }
        if (duplicateNum == newNum){
            System.out.println("\nNumber is Palindrome.");
        } else {
            System.out.println("\nNumber is not Palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner newi = new Scanner(System.in);
        Scanner news = new Scanner(System.in);

        int Choice = 0;
        int check = 1;
        System.out.println("!. Press 1 to check string\n2. Press 2 to check for number");
        while (check != 0){
            Choice = newi.nextInt();
            if (Choice != 1 && Choice != 2){
                System.out.println("Wrong input!\nEnter again.");
            } else {
                check = 0;
            }
        }
        if (Choice == 1){
            String word;
            System.out.println("\nEnter string");
            word = news.next();
            checkPalindrome(word);
        } else {
            int num;
            System.out.println("\nEnter number");
            num = newi.nextInt();
            checkPalindrome(num);
        }
    }
}
