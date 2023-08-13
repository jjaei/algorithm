import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		int max = 1000000;
		int min = -1000000;
		int n = sc.nextInt();
		int[] arry = new int[n];
		
		for(int i=0; i<n; i++) {
			arry[i] = sc.nextInt();
			if(arry[i]<max)
				max = arry[i];
			if(arry[i]>min)
				min = arry[i];
		} 
		
		System.out.println(max + " " + min);
	}
}
