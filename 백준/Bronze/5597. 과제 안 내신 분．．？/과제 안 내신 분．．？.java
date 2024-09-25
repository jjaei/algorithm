import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] check = new boolean[30];
        for (int i = 0; i < 28; i++) {
            int num = sc.nextInt();
            check[num - 1] = true;
        }
        for (int j = 0; j < check.length; j++) {
            if (!check[j]) {
                System.out.println(j + 1);
            }
        }
    }
}