import java.util.Scanner;

public class Main {
	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int time = 0;
		
		for(int i=0; i<input.length();i++) {
			if(input.charAt(i)-0<=67) { // ABC
				time += 3;
			} else if(input.charAt(i)-0<=70) {  // DEF
				time += 4;
			} else if(input.charAt(i)-0<=73) {  // GHI
				time += 5;
			} else if(input.charAt(i)-0<=76) {  // JKL
				time += 6;
			} else if(input.charAt(i)-0<=79) {  // MNO
				time += 7;
			} else if(input.charAt(i)-0<=83) {  // PQRS
				time += 8;
			} else if(input.charAt(i)-0<=86) {  // TUV
				time += 9;
			} else if(input.charAt(i)-0<=90) {  // WXYZ
				time += 10;
			} else {
				time += 11;
			}
	
		}
		System.out.println(time);
	}	
}