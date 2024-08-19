class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n, 3);
        String s = "";
        for(int i=str.length()-1; i>=0; i--) {
        	s += str.charAt(i);
        }
        return Integer.valueOf(s, 3);
    }
}