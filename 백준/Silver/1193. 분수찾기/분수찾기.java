import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		
		int line = 1;  // 대각선의 수
		int sum = 0; // 대각선 직전 대각선 까지 칸의 누적 합
		
		while(true) {
			if(X <= sum + line) {
				if(line%2==1) {
					// 대각선의 개수가 홀수면 분자가 큰 수부터 시작 
					// 분자는 대각선 상 블럭의 개수 - (X번째 - 직전 대각선까지 블럭 개수 - 1)
					// 분모는 X번째 - 직전 대각선까지 블럭 개수
					System.out.print(line-(X-sum-1) + "/"
							+ (X-sum));
					break;
				} else { // 대각선의 개수가 홀수
					System.out.print((X-sum) + "/" + 
							(line-(X-sum-1)));
					break;
				}		
			}else {
				sum += line;
				line++;
			}
		}
	}
}