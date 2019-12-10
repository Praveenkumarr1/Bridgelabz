package basiccoreprograms;

import java.util.Scanner;

public class poweroftwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the power value:");
		int num = sc.nextInt();
		int power = 1;
		if(num >= 0 && num < 31)
		{
			for(int i = 0; i <= num; i++)
			{
				System.out.println("2 ^" + i + " = " +power);
				power =  power * 2;		
			}
		}
	}
}