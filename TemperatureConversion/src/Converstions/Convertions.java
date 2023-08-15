package Converstions;
import java.util.Scanner;

public class Convertions {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Welcome to the Temperature Conversion Tool!");
    System.out.println("Select an option:\n1.Celsius To Fahrenheit\n2.Fahrenheit To Celsius");
    
    int num =scan.nextInt();
    switch(num)
    {
	case 1:
	{
		System.out.println("Enter number to convert Celsius to Fahrenheit");
		double  celsius=scan.nextDouble();
		double result= celsiusToFahrenheit(celsius);
		System.out.println(celsius+"C"+"is equievalent to"+result+"F");
		break;
	}
	case 2:
	{
		System.out.println("Enter number to convert Fahrenheit to celcius");
		double fahrenheit=scan.nextDouble();
		double result=fahrenheitToCelsius( fahrenheit );
		System.out.println(fahrenheit+"F"+" is equivalent to"+result+"C");
		break;
	}
	
	} 
}
public static double celsiusToFahrenheit(double celsius)
{
	
	return(celsius * 9/5) + 32;	
}
public static double fahrenheitToCelsius(double fahrenheit )
{
	return(fahrenheit - 32)*5/9;

}
}
