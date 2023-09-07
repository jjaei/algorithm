import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int check = 1;

        sc.close();

        for (int i = 0; i <  str.length()-i; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                check = 0;
                break;
            }
        }
        System.out.print(check);
    }
}