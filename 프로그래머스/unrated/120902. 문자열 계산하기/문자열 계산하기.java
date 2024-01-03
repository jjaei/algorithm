class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split(" ");
        int answer = Integer.valueOf(arr[0]);
        for (int i = 1; i < arr.length; i+=2) {
            if (arr[i].equals("+")) {
                answer += Integer.valueOf(arr[i + 1]);
            } else {
                answer -= Integer.valueOf(arr[i + 1]);
            }
        }
        return answer;
    }
}