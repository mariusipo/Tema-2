package org.example;

/**
 * Calculate the sum of the first 100 numbers higher than 0
 *
 */
public class SumNaturals
{
    public static void main( String[] args ) {
    int num = 100, sum = 0;
    for ( int i = 0; i <=num; ++i ){
        sum += i;
    }
    System.out.println("Sum "+ "= " + sum);
    }
}
