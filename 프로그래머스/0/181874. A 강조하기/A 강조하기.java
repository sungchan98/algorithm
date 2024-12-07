class Solution {
    public String solution(String myString) {
        char[] charArray = myString.toLowerCase().toCharArray(); 

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'a') { 
                charArray[i] = 'A';  
            }
        }
        
        return new String(charArray);
    }
}