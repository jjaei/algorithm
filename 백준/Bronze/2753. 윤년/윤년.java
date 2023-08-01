import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

	int year = 0;
	Scanner sc = new Scanner(System.in);
	year = sc.nextInt();
	
	if(year%4==0){
		if(!(year%100==0)) {
			System.out.println(1);
		} else if(year%400==0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}else {
		System.out.println(0);
	}
  }		
}