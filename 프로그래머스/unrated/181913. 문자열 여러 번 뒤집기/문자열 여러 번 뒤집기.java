class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder answer = new StringBuilder(my_string);

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            while (start < end) {
                char temp = answer.charAt(start);
                answer.setCharAt(start, answer.charAt(end));
                answer.setCharAt(end, temp);
                start++;
                end--;
            }
        }
        return answer.toString();
    }
}