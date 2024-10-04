import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int answer = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                answer = 0;
                break;
            }
            if (i == str.length() - i - 1) {
                break;
            }
        }
        System.out.println(answer);
    }
}