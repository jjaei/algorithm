import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double sum = 0;   // 학점 * 과목평점  
		double hsum = 0;   // 학점의 총합  
		
		for(int i=0; i < 20; i++) {
			String s = sc.next();   // 과목  
			double h = sc.nextDouble();   // 학점  
			String g = sc.next(); 
			
			if(g.equals("A+")) {
				sum += 4.5 * h ;
				hsum += h;
			} else if(g.equals("A0")) {
				sum += 4.0 * h;
				hsum += h;
			} else if(g.equals("B+")) {
				sum += 3.5 * h;
				hsum += h;
			} else if(g.equals("B0")) {
				sum += 3.0 * h;
				hsum += h;
			} else if(g.equals("C+")) {
				sum += 2.5 * h;
				hsum += h;
			} else if(g.equals("C0")) {
				sum += 2.0 * h;
				hsum += h;
			} else if(g.equals("D+")) {
				sum += 1.5 * h;
				hsum += h;
			} else if(g.equals("D0")) {
				sum += 1.0 * h; 
				hsum += h;
			} else if(g.equals("F")) {
				sum += 0.0 * h;
				hsum += h;
			} 
		
		}
		
		System.out.printf("%.6f",sum/hsum);
		
	}

}
