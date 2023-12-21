class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long reqMoney = 0;
        for (int i = 1; i <= count; i++) {
            reqMoney += price * i;
        }
        if (reqMoney > money) {
            answer = Math.abs(money - reqMoney);
        } else {
            answer = 0;
        }
        return answer;
    }
}