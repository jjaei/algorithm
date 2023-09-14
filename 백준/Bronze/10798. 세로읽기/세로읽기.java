import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] input = new char[5][15];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                input[i][j] = ' ';
            }
        }


        for (int i = 0; i < 5; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < str.length(); j++) {
                input[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (input[j][i] != ' ') {
                    System.out.print(input[j][i]);
                }
            }
        }
    }
}