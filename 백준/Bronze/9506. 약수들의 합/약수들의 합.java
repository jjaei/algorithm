import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }

            int sum = 0;
            StringBuilder sb = new StringBuilder();

            for (int i = 1; i < num; i++) {
                if (num % i == 0){
                    sum += i;
                    sb.append(i).append(" + ");
                }
            }

            if (sum == num) {
                sb.setLength(sb.length() - 3);
                System.out.println(num + " = " + sb);
            } else {
                System.out.println(num + " is NOT perfect.");
            }
        }
    }
}