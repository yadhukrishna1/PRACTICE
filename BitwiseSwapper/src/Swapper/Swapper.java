package Swapper;

import java.util.Scanner;

public class Swapper {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the first integer and second integer");
	int num1=scan.nextInt();
	int num2=scan.nextInt();
	System.out.println("Before swapping\nFirst="+num1+"\nSecond="+num2);
	System.out.println();
	swapUsingBitwise(num1,num2); 
	
}
public static void swapUsingBitwise(int num1,int num2) 
{
	int temp=num1^num2;
	num1=num1^num2;
	num2=temp^num2;
	num1=num1^num2;
	System.out.println("After swapping\nfirst="+num1+"\nSecond="+num2);
}
}
