import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] b = new int[n+1];
		int start = 0;
		int end = 0;
		int ball = 0;

	
		for(int i=0; i<m; i++) {
			start = sc.nextInt();
			end = sc.nextInt();
			ball = sc.nextInt();
			for(int j=start; j<=end; j++) {
				b[j] = ball;
			}
		}
		
		for(int i=1; i<b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
}