class Solution {
    public boolean repeatedSubstringPattern(String s) {
      int n=s.length();
      int[] lenpresuff=new int[n];

      int length=0;
      int i=1;
      while(i<n){
        if(s.charAt(i)==s.charAt(length)){
            length++;
            lenpresuff[i]=length;
            i++;

        } else {
            if(length!=0){
                length=lenpresuff[length-1];

            } else {
                lenpresuff[i]=0;
                i++;
            }
        }
      } 
      int l=lenpresuff[n-1];
      int patternlen=n-l;
      return(l>0 && n% patternlen == 0); 
    }
}