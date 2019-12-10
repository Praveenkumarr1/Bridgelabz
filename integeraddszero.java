package functionalprograms; 

import java.util.Arrays;
import java.util.Scanner;

public class integeraddszero {
		public static void main(String[] args)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the size of an array");
			int size=s.nextInt();
			System.out.println("array containt:");
			int a[]=new int[size];
			for(int i=0;i<size;i++)
			{
				a[i]=s.nextInt();
			}
			System.out.println(Arrays.toString(a));
			int count = 0;
			for(int i = 0; i < a.length -2; i++)
			{
				for(int j = i + 1; j < a.length -1; j++)
				{
					for(int k = j + 1; k < a.length; k++ )
					{
						if(a[i] + a[j] + a[k] == 0)
						{
							count ++;
							System.out.print(a[i]);
							System.out.print(",");
							System.out.print(a[j]);
							System.out.print(",");
							System.out.print(a[k]);
							System.out.print("\n");
						}
					}
				}
			}
			System.out.println("Total number count:" +count);
			 
			
		}
}
