class Solution {
    public boolean solution(int x) {
        int division = x;
        int sum = 0;
        while (division > 0) {
            if (division == 0) {
                continue;
            }
            sum += division % 10;
            division /= 10;
        }
        return x % sum == 0 ? true : false;
    }
}