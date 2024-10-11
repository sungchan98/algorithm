class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String ab = Integer.toString(a) + Integer.toString(b);
        int ab2 = 2 * a * b;
        
        if (Integer.parseInt(ab) >= ab2) {
            answer = Integer.parseInt(ab);
        } else {
            answer = ab2;
        }
        
        return answer;
    }
}