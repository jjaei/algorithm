class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int i = 0; i < array.length;) {
            while(array[i] > 0) {
                if (array[i] % 10 == 7) {
                    answer++;
                    array[i] /= 10;
                } else {
                    array[i] /= 10;
                }
            }
            i++;
        }
        return answer;
    }
}