import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 4 == 0) {
                sb.append("long ");
            }
        }
        System.out.println(sb.append("int"));
    }
}