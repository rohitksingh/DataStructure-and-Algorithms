package Walmart;

public class ValidPalindrome2 {

    public boolean validPalindrome(String s) {

        int start=0;
        int end =s.length()-1;

        while(start<end){

            if(s.charAt(start)!=s.charAt(end)){
                return isPalindrome(s.substring(start, end))
                        || isPalindrome(s.substring(start+1, end+1));
            }

            start++;
            end--;
        }

        return true;

    }

    public boolean isPalindrome(String s){
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }
}
