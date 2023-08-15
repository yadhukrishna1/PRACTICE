package TaxCalculator;

import java.util.Scanner;

public class TaxCalculator {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the purchase amount & Enter the tax rate");
	double purchaseamount=scan.nextDouble();
	double taxrate=scan.nextDouble();
	double totalcost=calculateTotalWithTa(purchaseamount,taxrate );
	System.out.println("Total cost ="+totalcost);
}
public static double calculateTotalWithTa(double purchaseamount,	double taxrate )
{
	return (purchaseamount* taxrate)+ purchaseamount;
}
}
