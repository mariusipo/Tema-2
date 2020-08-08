package org.example;

// Check if a number is palindrom( e.g palindrom 1221, 34143)
public class Palindrom {
    public static void main( String[] args ) {

        int num = 34143, reversedInteger = 0, remainder, originalInteger;

        originalInteger = num;

        for( ;num != 0; num /= 10 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
        }

        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(originalInteger + " is not a palindrome.");
    }
}


