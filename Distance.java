package functionalprograms;
import java.util.Scanner;

public class Distance {
	
		public static void main(String[] args) {
			int x=0;
			int y = 0;
			try
			{
				x = Integer.parseInt(args[0]);
				y = Integer.parseInt(args[1]);
			}
			catch (NumberFormatException e) {
				e.printStackTrace();
			}
			double distance = Math.sqrt(x*x + y*y);
			System.out.println(distance);
		}
}
