package basiccoreprograms;

import java.util.Scanner;

public class flipcoin {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter positive number : ");
		int number = s.nextInt();
		int TailsCount = 0 ;
		int HeadCount = 0;
		if(number > 0)
		{
			while(number > 0)
			{
				double range = random();
				System.out.println(range);
				if(range > 0.5)
				{
					HeadCount ++;
				}
				else
					TailsCount ++; 
				number --;
			}
				System.out.println(HeadCount);
				System.out.println(TailsCount);
				float count = HeadCount + TailsCount;
				System.out.println(HeadCount/count);
				System.out.println("Percentage of Heads:" + (HeadCount / count) * 100  +" % ");
				System.out.println("Percentage of Tails:" + (TailsCount / count) * 100 +" % ");
			
		}
		else 
			System.out.println("Please enter the positive number:");
		
		
	}
	public static double random()
	{
		double ran = 0;
		for(double i = 0;i < 1; i++)
		{
			ran = Math.random();
		 
			return Math.random();
			
		}
		return ran;
		
	}
}
