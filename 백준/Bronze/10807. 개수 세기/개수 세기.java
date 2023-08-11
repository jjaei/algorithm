import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int v = sc.nextInt();

        for (int j = 0; j < array.length; j++) {
            if (array[j] == v) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}