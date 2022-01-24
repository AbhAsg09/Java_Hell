package Abhishek;

import java.util.Scanner;

public class Palindrome_Number {
    static boolean checkPalindrome(int num){
        int newNum = 0;
        int duplicateNum = num;
        while (num != 0){
            newNum = ((newNum*10)+(num%10));
            num = num/10;
        }
        return (duplicateNum == newNum);
    }
    public static void main(String[] args) {
        Scanner newi = new Scanner(System.in);
        int num;
        System.out.println("Enter Number");
        num = newi.nextInt();
        if (checkPalindrome(num)){
            System.out.println("Number is a palindrome");
        } else {
            System.out.println("Number is not a palindrome");
        }
    }
}
