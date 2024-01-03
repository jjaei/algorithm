class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split(" ");
        int answer = Integer.valueOf(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].equals("+")) {
                answer += Integer.valueOf(arr[i + 1]);
                i++;
            } else {
                answer -= Integer.valueOf(arr[i + 1]);
                i++;
            }
        }
        return answer;
    }
}