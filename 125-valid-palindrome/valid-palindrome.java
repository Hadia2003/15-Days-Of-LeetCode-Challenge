class Solution {
    public boolean isPalindrome(String s) {
        String lower_case = s.toLowerCase();
        String string = lower_case.replaceAll(
          "[^a-zA-Z0-9]", "");
        String palindrome="";
        char ch;
        for(int i=0; i<string.length();i++){
            ch = string.charAt(i);
            palindrome = ch+palindrome;
          }  
        if (string.equals(palindrome)){
            return true;
        }
        else
            return false;
    }
        
    }