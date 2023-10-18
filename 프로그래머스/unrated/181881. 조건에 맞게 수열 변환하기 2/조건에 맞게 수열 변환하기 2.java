class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int count = 0;

        while(count < arr.length){
            count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >=50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = (arr[i] * 2) + 1;
                } else {
                    count++;
                }
            }
            answer++;
        }
        return answer - 1;
    }
}