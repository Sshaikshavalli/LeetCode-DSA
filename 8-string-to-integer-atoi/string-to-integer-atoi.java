class Solution {
    public int myAtoi(String s) {
     int max=Integer.MAX_VALUE;
     int min=Integer.MIN_VALUE;

     int n=s.length();
     int i=0;
     while(i < n && s.charAt(i)==' ') i++;
     if(i==n) return 0;

     int sign=1;
     char c=s.charAt(i);
     if(c=='+'){
        i++;

     }   else if (c=='-'){
     sign=-1;
     i++;
     
    }
    long result=0;
    while(i < n && Character.isDigit(s.charAt(i))){
        int digit =s.charAt(i)-'0';

        if(result > max/10 || (result == max/10 &&digit>max%10)){
            return sign==1? max:min;
        }
        result=result*10+digit;
        i++;
    }
    result=result*sign;
    return (int) result;
}
}