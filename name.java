package basiccoreprograms;

import java.util.Scanner;

public class name {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter user name");
		String s1=s.nextLine();
		String s2= "Hello <<userename>>, How are you?"; 
		if(s1.length()>=3) {
			String s3=s2.replace("userename", s1);
			System.out.println(s3);
		}
		else {
			System.out.println("enter user name with more than 03 character");
}
}
}
