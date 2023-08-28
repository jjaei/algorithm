import java.util.Scanner;

public class Main {
	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().trim();
		int sum = 0;
		int sp = 0;
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			if(ch == ' ') {
				sp++;
			} else {
				sum++;
			}
		}
		
		if(sum != 0) {
			System.out.println(sp+1);
		} else {
			System.out.println(0);
		}
	}
}