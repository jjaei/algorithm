import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        Arrays.sort(arr);
        int triangle = 0;

        if (arr[2] < arr[0] + arr[1]) {
            triangle = arr[0] + arr[1] + arr[2];
        } else {
            arr[2] = arr[0] + arr[1] - 1;
            triangle = arr[0] + arr[1] + arr[2];
        }

        System.out.println(triangle);
    }
}