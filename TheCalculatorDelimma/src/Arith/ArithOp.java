package Arith;
import java.util.Scanner;
public class ArithOp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 number:");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println("Enter your choice\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus\n6.Exit");
	int c=scan.nextInt();
	arthmeticOperation(num1, num2, c);
	
	}
	public static void arthmeticOperation(int num1,int num2,int c) {
		
	switch(c)
	{
	case 1:
	{
		c=num1+num2;
		System.out.println("Addition="+c);
		break;
	}
	case 2:
	{
		c=num1-num2;
		System.out.println("Subtraction="+c);
		break;
	}
	case 3:
	{
		c=num1*num2;
		System.out.println("Multiplication="+c);
		break;
	}
	case 4:
	{
		c=num1/num2;
		System.out.println("Division="+c);
		break;
	}
	case 5:
	{
		c=num1%num2;
		System.out.println("Modulus="+c);
		break;
	}
	case 6:
	{
		
		System.out.println("invalid number....!");
		break;
	}
	}
	}
}
