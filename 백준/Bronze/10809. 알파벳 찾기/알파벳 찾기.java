import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] ap = new int[26];
		
		for(int i=0; i < ap.length; i++) {
			ap[i] = -1;
		}
		
		String s = sc.next();
		for(int i=0; i<s.length(); i++) {
			if(ap[s.charAt(i)-97] == -1) 
				ap[s.charAt(i)-97] = i;

		}
		
		for(int i=0; i<ap.length; i++) {
			System.out.print(ap[i] + " ");
		}
		
	}

}