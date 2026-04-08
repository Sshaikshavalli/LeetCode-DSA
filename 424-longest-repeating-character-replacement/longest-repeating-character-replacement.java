class Solution {
    public int characterReplacement(String s, int k) {
     int[] freq=new int[26];
     int maxlength=0, maxfreq=0,left=0;
     for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        freq[ch-'A']++;
        maxfreq=Math.max(maxfreq,freq[ch-'A']);
     while((i-left+1)-maxfreq>k){
      freq[s.charAt(left)-'A']--;
      left++;
     }
     maxlength=Math.max(maxlength,i-left+1);
     }  
     return maxlength;
    }
}