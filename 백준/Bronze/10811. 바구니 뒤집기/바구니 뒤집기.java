import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 바구니의 갯수
        int m = sc.nextInt();  // 바구니의 순서를 역순으로 만들 횟수
        int[] basket = new int[n];
        for (int i = 0; i < basket.length; i++) {
            basket[i] = i + 1;
        }
        for (int j = 0; j < m; j++) {
            // start부터 end를 역순으로 만든다.
            int start = sc.nextInt();
            int end = sc.nextInt();
            for (int k = 0; start + k < end - k; k++) {
                int tmp = basket[start - 1 + k];
                basket[start - 1 + k] = basket[end - 1 - k];
                basket[end - 1 - k] = tmp;
            }
        }
        for (int l = 0; l < basket.length; l++) {
            System.out.print(basket[l] + " ");
        }
    }
}