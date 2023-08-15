package counter;

import java.util.Scanner;

public class Counter {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=scan.nextInt();
	int c=countSetBits(num);
	System.out.println("Number of bits="+c);

}
public static int countSetBits(int num)
{
	int count =0;
	while(num>0)
	{
			count+=num&1;
			num>>=1;
	}
	return count;	
}

}
