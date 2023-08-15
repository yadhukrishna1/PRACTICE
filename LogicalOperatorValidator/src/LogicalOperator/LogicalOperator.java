package LogicalOperator;

import java.util.Scanner;

public class LogicalOperator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Is input valid");
		boolean valid=scan.nextBoolean();
		System.out.println("Does input meet a certain condition");
		boolean condition=scan.nextBoolean();
		boolean Result=isValidInput(valid,condition);
		System.out.println(Result);
		if(Result==true)
		{
			System.out.println("Valid Input");
		}
		else
		{
			System.out.println("Invalid input");
		}
	}
	public static boolean isValidInput(boolean valid,boolean condition)
	{
		return valid&&condition;
	}

}
