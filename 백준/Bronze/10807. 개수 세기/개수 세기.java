import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }
        int v = sc.nextInt();

        int answer = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == v) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}