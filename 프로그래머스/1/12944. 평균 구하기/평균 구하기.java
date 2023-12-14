class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for (double d : arr) {
            answer += d;
        }
        return answer / arr.length;
    }
}