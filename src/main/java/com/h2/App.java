package com.h2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static int doubleTheNumber(int number) {
        return number * 2;
    }
    
    private static int add(int[] numbers)
    {
    	int sum = 0;
    	for (int x = 0; x < numbers.length; x++)
    	{
    		sum = sum + numbers[x];
    	}
    	return sum;
    }
    

    
}
