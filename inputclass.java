package basiccoreprograms;
import java.util.Scanner;
public class inputclass {
	public static String name;
	public static int number;
	static Scanner s = new Scanner(System.in);
	public static void inputname()
	{
		
		String stringname = s.nextLine();
		name = stringname;
	}
	public static void inputnumber()
	{
		number = s.nextInt();
	}
}
