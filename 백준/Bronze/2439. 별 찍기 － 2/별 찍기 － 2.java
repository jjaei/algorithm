import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String star = "";

        for (int i = 0; i < n; i++) {
            star += "*";
            for (int j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print(star);
            System.out.println();
        }
    }
}