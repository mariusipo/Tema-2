package org.example;
import java.util.Scanner;

// Display the max digit from a number

public class MaxDigit {
    public static void main( String[] args ) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number ");
        int n = s.nextInt();
        int m=n, min = 0 , max = 0, r;
        while(m!=0){
            r=m%10;
            if(r>max) max = r;
            m=m/10;
        }

System.out.println("Max = " + max);

    }
}
