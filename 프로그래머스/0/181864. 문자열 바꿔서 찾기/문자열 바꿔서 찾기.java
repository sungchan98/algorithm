class Solution {
    public int solution(String myString, String pat) {
        char[] arr = new char[myString.length()];
        
        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            arr[i] = (c == 'A') ? 'B' : 'A';
        }
        String swapped = new String(arr); 

        return swapped.contains(pat) ? 1 : 0;
    }
}