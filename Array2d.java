package functionalprograms;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Scanner.*;

public class Array2d {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data type to be use in the array:");
		String dataType = sc.nextLine();
		if(dataType.equals("int"))
		{
		Array2d.inArray();
			
		}
		else
		{
			if(dataType.equals("double"))
			{
				Array2d.douArray();;
				
			}
			else
			{
			if(dataType.equals("boolean"))
			{
			Array2d.booArray();;
			}
				else
					System.out.println("Data type not found:");
			}
		}
	}
	
	public static void inArray()
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Please enter row:");
		int row = sc.nextInt();
		System.out.println("Please enter the coulum:");
		int coul = sc.nextInt();
		
		int[][] array = new int[row][coul];
		System.out.println("Please enter the arrays elements:");
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < coul; j++)
			{
				System.out.print("Please enter the elements:");
				array[i][j] = sc.nextInt();
			}
		}
		Array2d.showInArrays(array);
		
	}
	public static void douArray()
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Please enter row:");
		int row = sc.nextInt();
		System.out.println("Please enter the coulum:");
		int coul = sc.nextInt();
		
		double[][] array = new double[row][coul];
		System.out.println("Please enter the arrays elements:");
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < coul; j++)
			{
				System.out.print("Please enter the elements:");
				array[i][j] = sc.nextDouble();
			}
		}
		Array2d.showDoArrays(array);
		
	}
	public static void booArray()
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Please enter row:");
		int row = sc.nextInt();
		System.out.println("Please enter the coulum:");
		int coul = sc.nextInt();
		
		boolean[][] array = new boolean[row][coul];
		System.out.println("Please enter the arrays elements:");
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < coul; j++)
			{
				System.out.print("Please enter the elements:");
				array[i][j] = sc.nextBoolean();
			}
		}
		Array2d.showBoArrays(array);
	}
	public static void showInArrays(int[][] array)
	{
		int row = array.length;
		int coul = array[0].length;
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < coul; j++)
			{
				if(j < coul- 1)
				{
					System.out.print(array[i][j] + " , ");
				}
				else
				{
					System.out.print(array[i][j] );
				}	
			}
			System.out.println();
		}
	}
	public static void showDoArrays(double[][] array)
	{
		int row = array.length;
		int coul = array[0].length;
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < coul; j++)
			{
				if(j < coul- 1)
				{
					System.out.print(array[i][j] + " , ");
				}
				else
				{
					System.out.print(array[i][j] );
				}
			}
			System.out.println();
		}
	}
	public static void showBoArrays(boolean[][] array)
	{
		int row = array.length;
		int coul = array[0].length;
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < coul; j++)
			{
				if(j < coul- 1)
				{
					System.out.print(array[i][j] + " , ");
				}
				else
				{
					System.out.print(array[i][j] );
				}
			}
			System.out.println();
		}
	}

}
