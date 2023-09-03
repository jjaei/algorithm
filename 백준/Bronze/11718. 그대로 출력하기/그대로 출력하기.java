import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = "";
		while(sc.hasNextLine()) {
			// 다음 입력 데이터가 있는지 여부를 판단함.
			// boolean타입의 반환값을 가짐.
			s = sc.nextLine();
			System.out.println(s);
			// EOF : 더 이상 읽을 데이터가 없으면 끝.
		}
	}

}
