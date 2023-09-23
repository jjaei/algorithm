
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int up = sc.nextInt();
		int down = sc.nextInt();
		int length = sc.nextInt();
		int snail = 0;
		int day = (length-down) /(up-down);
		
		if((length-down)%(up-down)!=0) {
			snail++;
		}
		
				System.out.println(day + snail);
			
	}
}