import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> resultList = new ArrayList<>();

        for (int num : arr) {
            boolean isDeleted = false;
            for (int deleteNum : delete_list) {
                if (num == deleteNum) {
                    isDeleted = true; 
                    break; 
                }
            }
            if (!isDeleted) {
                resultList.add(num);
            }
        }

        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }

        return answer;
    }
}