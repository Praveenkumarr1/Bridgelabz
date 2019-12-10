package basiccoreprograms;

import java.util.Scanner;

public class harmonic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Nth harmonic value:");
		int num = sc.nextInt();
		final float a = 1;
		double harmonic  = 0;
		
		for(int i = 1; i <= num; i++)
		{
			harmonic = harmonic +  a / i;
		}
		System.out.println("Nth Harmonic value:"  + harmonic);
	}
}
