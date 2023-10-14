class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            int start = parts[i][0];
            int end = parts[i][1];
            for (int j = start; j <= end; j++) {
                sb.append(my_strings[i].charAt(j));
            }
        }
        return sb.toString();
    }
}