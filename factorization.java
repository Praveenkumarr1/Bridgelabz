package basiccoreprograms;
import java.util.Scanner;
public class factorization {
	public static void main(String[] args)
	{
	System.out.println("enter the number to find the prime factors:");
	inputclass.inputfactor();
	int number = inputclass.number;
	System.out.print("prime factors of " + number +" : ");
	for(int i = 1; i <= number / 2; i++)
	{
		if(number % i == 0)
		{
			System.out.println( i + " \t");											
		}
	}
	
}
}