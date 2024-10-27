class Solution {
    public int[] solution(int n, int k) {
        int[] arr = new int[n/k];
        int j = 0;
            
        for(int i=k; i <= n; i += k){   
            arr[j++] = i;         
        }
        
        return arr;
    }
}