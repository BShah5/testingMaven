package com.calculator.calculator;

/**
 * Hello world!
 *
 */
public class App 
{
	int a,b;
	App(int x, int y) {
		a=x;
		b=y;
	}
	
	public int add() {
		return a+b;
	}
	
	public int subtract() {
		return a-b;
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
