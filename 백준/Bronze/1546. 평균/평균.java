import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double max = Double.MIN_VALUE;
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            int score = sc.nextInt();
            if (max < score) {
                max = score;
            }
            arr[i] = score;
        }
        double sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j] / max * 100;
        }
        System.out.println(sum / num);
    }
}