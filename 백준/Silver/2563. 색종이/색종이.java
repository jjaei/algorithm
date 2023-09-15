import java.util.Scanner;

public class Main {
	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		int paper = sc.nextInt();
		int width = 0;  // 넓이
		boolean [][] bArr = new boolean[101][101];  // 도화지
		// boolean 배열을 선언하고 어떤 수에 대해 bArr[x][y]가 true면
		// 그 부분은 색종이가 붙여져 있는 것이다.
		
		for(int i=0; i<paper; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			//(x,y) 부터 (x+9, y+9)까지 영역을 하나씩 체크한 후 총 넓이에 더해준다.
			for(int j=x; j<x+10; j++) {
				for(int k=y; k<y+10; k++) {
					if(bArr[j][k]!=true) {
						bArr[j][k]=true;
						width++;
					}
				}
			}
			
		}
		System.out.println(width);
	}
}