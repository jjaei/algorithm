class Solution {
    public int solution(String s) {
        int answer = 0;
        
        while(s.length() > 0) {
        	char c = s.charAt(0);
        	int count1 = 1;
        	int count2 = 0;
        	int i;
        	for(i=1; i<s.length(); i++) {
        		if(c == s.charAt(i)) {
        			count1++;
        		} else {
        			count2++;
        		}
        		
        		if(count1 == count2) {
        			s = s.substring(i + 1);
        			answer++;
                    i = 0;
        			break;
        		}
        	}
        	if(i >= s.length()) {
        		break;
        	}
        }
        
        if(s.length() != 0) {
        	answer++;
        }

        return answer;
    }
}