class Solution {
    public int solution(String binomial) {
        String[] str = binomial.split(" ");
        int answer = 0;
        int a = Integer.valueOf(str[0].trim());
        String op = str[1].trim();
        int b = Integer.valueOf(str[2].trim());

        if (op.equals("+")) {
            answer = a + b;
        } else if (op.equals("-")) {
            answer = a - b;
        } else {
            answer = a * b;
        }
        return answer;
    }
}