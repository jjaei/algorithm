import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int check = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'c'  && i + 1 < str.length()) {
                if (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
                    check++;
                    i++;
                } else {
                    check++;
                }
            } else if (str.charAt(i) == 'd' && i + 1 < str.length()) {
                if (i + 2 < str.length() && str.charAt(i + 1) == 'z' && str.charAt(i + 2) == '=') {
                    check++;
                    i += 2;
                } else if (str.charAt(i + 1) == '-') {
                    check++;
                    i++;
                } else {
                    check++;
                }
            } else if (str.charAt(i) == 's' && i + 1 < str.length()) {
                if (str.charAt(i + 1) == '=') {
                    check++;
                    i++;
                } else {
                    check++;
                }
            } else if (str.charAt(i) == 'z' && i + 1 < str.length()) {
                if (str.charAt(i + 1) == '=') {
                    check++;
                    i++;
                } else {
                    check++;
                }
            } else if (str.charAt(i) == 'l' && i + 1 < str.length()) {
                if (str.charAt(i + 1) == 'j') {
                    check++;
                    i++;
                } else {
                    check++;
                }
            } else if (str.charAt(i) == 'n' && i + 1 < str.length()) {
                if (str.charAt(i + 1) == 'j') {
                    check++;
                    i++;
                } else {
                    check++;
                }
            } else {
                check++;
            }
        }
        System.out.print(check);
    }
}