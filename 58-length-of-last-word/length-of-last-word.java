class Solution {
    public int lengthOfLastWord(String s) {
        int i=s.length()-1;
      int count=0;
      while(i>=0 && s.charAt(i)==' '){
      i--;
      
        
      }  
      while(i>=0 && s.charAt(i)!=' '){
      count++;
      i--;
      }
    return count;
}
}

public class Main{
    public static void main(String[] args){
        String s="Hello World";
     Solution sol=new Solution();
     System.out.println(sol);

    }
}