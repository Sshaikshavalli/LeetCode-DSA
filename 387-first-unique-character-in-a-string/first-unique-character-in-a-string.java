class Solution {
    public int firstUniqChar(String s) {
      Map<Character, Integer> charcounts=new HashMap<>();
      for(char c:s.toCharArray()){
      charcounts.put(c, charcounts.getOrDefault(c,0)+1);
      }  
      for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(charcounts.get(c)==1){
            return i;
        }
      }
      return -1;
    }
}