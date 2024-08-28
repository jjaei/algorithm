import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i : moves) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][i-1] != 0) {
                    int item = board[j][i-1];
                    board[j][i-1] = 0;
                    if (!stack.isEmpty() && stack.peek() == item) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(item);
                    }
                    break;
                }
            }
        }
        return answer;
    }
}