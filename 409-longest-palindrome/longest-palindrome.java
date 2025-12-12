class Solution {
    public int longestPalindrome(String s) {
       HashMap<Character, Integer> map=new HashMap<>();
       for(char c : s.toCharArray()){
       map.put(c, map.getOrDefault(c, 0) + 1);
       }
       int length= 0;
       boolean hasodd=false;
       for(int count:map.values()){
        if(count % 2==0){
            length+=count;
        } else {
            length+=count-1;
            hasodd=true;
        }
       }
       if(hasodd) length+=1;
      return length;
    }
}