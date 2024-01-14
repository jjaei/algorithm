class Solution {
    public int solution(int n) {
        int num = 1;
        int count = 1;
        while(true) {
            num *= count;
            if (num == n) {
                break;
            } else if (num > n) {
                count -= 1;
                break;
            }
            count++;
        }
        return count;
    }
}