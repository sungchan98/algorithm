import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(String[] strArr) {

        List<String> answer = new ArrayList<>(Arrays.asList(strArr));
        
        for (int i = 0; i < answer.size(); i++) {
            String current = answer.get(i);
            if (current.contains("ad")) {
                answer.remove(i);
                i--; 
            }
        }
        
        return answer.toArray(new String[0]);
    }
}