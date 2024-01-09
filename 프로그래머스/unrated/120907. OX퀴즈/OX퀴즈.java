class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] arr = quiz[i].split(" ");
            int num1 = Integer.valueOf(arr[0]);
            int num2 = Integer.valueOf(arr[2]);
            int result = Integer.valueOf(arr[4]);
            for (int j = 0; j < arr.length; j++) {
                if (arr[1].equals("+")) {
                    if (num1 + num2 == result) {
                        answer[i] = "O";
                    } else {
                        answer[i] = "X";
                    }
                } else {
                    if (num1 - num2 == result) {
                        answer[i] = "O";
                    } else {
                        answer[i] = "X";
                    }
                }
            }
        }
        return answer;
    }
}