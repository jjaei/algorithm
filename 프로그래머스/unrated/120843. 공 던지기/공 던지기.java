class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int index = 0;
        for (int i = 0; i < k; i++) {
            if (index >= numbers.length) {
                index = index - numbers.length;
            }
            answer = numbers[index];
            index += 2;
        }
        return answer;
    }
}
