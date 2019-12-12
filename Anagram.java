package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
		public static void main(String args[]) {
			Scanner s=new Scanner(System.in);
			System.out.print("Enter the two strings:");
			String str1=s.nextLine();
			String str2=s.nextLine();
			str1.toLowerCase();
			str2.toLowerCase();
			char arr1[]=str1.toCharArray();
			char arr2[]=str2.toCharArray();
			if(arr1.length==arr2.length)
			{
				Arrays.sort(arr1);
				Arrays.parallelSort(arr2);
				String sortedstr1=new String(arr1);
				String sortedstr2=new String(arr2);
				if(sortedstr1.equals(sortedstr2))
				{
					System.out.print("Anagram");
				}else
					System.out.print("Not an Anagram");
			}
			}
			
			
		}
