class Solution {
    public boolean ispal(String s,int i,int j){
        while(i<j){
        if(s.charAt(i)==s.charAt(j)){
            i++;
            j--;
        }
        else
        return false;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
       int i=0,j=s.length()-1;
       while(i<j){
       
        if(s.charAt(i)==s.charAt(j)){
            i++;
            j--;
        }
        else if(ispal(s,i+1,j)){
            return ispal(s,i+1,j);
        }
        else if(ispal(s,i,j-1)){
           return ispal(s,i,j-1);
        }
        else{
         if(s.charAt(i)!=s.charAt(j))
            return false;
        }
       }
       return true;
    }
}