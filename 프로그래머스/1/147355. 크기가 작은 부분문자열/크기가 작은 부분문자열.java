class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            if (Long.valueOf(p) >= Long.valueOf(t.substring(i, i + p.length()))) {
                System.out.println(t.substring(i, i + p.length()));
                answer++;
            }
        }
        return answer;
    }
}
