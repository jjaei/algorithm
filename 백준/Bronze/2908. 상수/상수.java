import java.util.Scanner;

public class Main {
	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		
		int num1 = Integer.parseInt(new StringBuffer(s1).reverse().toString());
		int num2 = Integer.parseInt(new StringBuffer(s2).reverse().toString());
		
		System.out.println(num1 > num2 ? num1 : num2);

	}
}