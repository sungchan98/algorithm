import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        
        List<Integer> tempList = new ArrayList<>();
        tempList.add(n);
      
        while(n != 1) {
            if(n % 2 == 0) {
                n /= 2;  
            } else {
                n = 3 * n + 1;
            }
            tempList.add(n);
        }
          
        int[] answer = new int[tempList.size()];
        
        for(int i = 0; i < tempList.size(); i++) {
            answer[i] = tempList.get(i);
        }
       
        return answer;
    }
}