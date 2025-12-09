class Solution {
    public boolean wordPattern(String pattern, String s) {
       String[] word=s.split(" ");
       if(pattern.length() != word.length ) 
       return false;

       HashMap<Character, String> map=new HashMap<>();
       HashMap<String, Character> reversemap=new HashMap<>();

       for(int i=0;i<pattern.length();i++){
        char c=pattern.charAt(i);
        String w=word[i];
        
       if(map.containsKey(c)){
        if(!map.get(c).equals(w))
        return false;
        
       } else {
        map.put(c, w);
       }
       if(reversemap.containsKey(w)){
        if(reversemap.get(w) !=c)
        return false;

       } else {
        reversemap.put(w, c);
       }
    }
    return true;
}
}