package Algorithms;
import java.util.Arrays;
import java.util.Scanner;
public class word {
		public static void main(String args[])
		{	
		Scanner s=new Scanner(System.in);
		int i;
		System.out.println("Enter number of words you wish to input");
		int n=s.nextInt(); 
		String[] words=new String[n];
		System.out.print("Enter the words:");
		for(i=0;i<words.length;i++)
		{
			System.out.print("word" + i+1 +":");
			words[i]=s.next();
		}
		System.out.println("Enter the word to be search:");
		String word=s.next();
		Arrays.sort(words);
		int index = Arrays.binarySearch(words,word);
		System.out.println(word + "is"+ index);
}
		
}
