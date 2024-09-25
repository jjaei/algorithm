import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 바구니 갯수
        int m = sc.nextInt();  // 공을 넣을 횟수
        int[] basket = new int[n];

        for (int i = 0; i < m; i++) {
            // a번 바구니부터 b번 바구니까지 c번 번호가 적혀져있는 공을 넣는다.
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            for (int j = a; j <= b; j++) {
                basket[j - 1] = c;
            }
        }
        for (int k = 0; k < basket.length; k++) {
            System.out.print(basket[k] + " ");
        }
    }
}