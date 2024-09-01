class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = Integer.toBinaryString(n);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        while (true) {
            n++;
            int cnt = 0;
            String str = Integer.toBinaryString(n);
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '1') {
                    cnt++;
                }
            }
            if (cnt == count) {
                answer = n;
                break;
            }
        }
        return answer;
    }
}