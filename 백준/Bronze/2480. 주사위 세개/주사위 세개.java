import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int money = 0;
		
		if(a==b && a==c && b==c) {
			money=10000+(a*1000);
			System.out.println(money);
		} else if(a==b || a==c) {
			money=1000+(a*100);
			System.out.println(money);
		} else if(b==c ) {
			money=1000+(b*100);
			System.out.println(money);
		} else{
			System.out.println((Math.max(a, Math.max(b,c))*100));
		}
  }
}

