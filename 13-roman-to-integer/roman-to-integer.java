class Solution {
public int romanToInt(String s) {
        int sum=0;

        int[] values = new int[26]; 
        values['I'-'A']=1;
        values['V'-'A']=5;
        values['X'-'A']=10;
        values['L'-'A']=50;
        values['C'-'A']=100;
        values['D'-'A']=500;
        values['M'-'A']=1000;

        for(int i=0;i<s.length();i++){
            int value=values[s.charAt(i) - 'A'];
            if(i+1<s.length() && value < values[s.charAt(i+1)-'A']) {
                sum -= value;

            } else {
                sum += value;
            }
        }
        return sum;
    }
}

public class Main{
    public static void main(String[] args){
        Solution sol=new Solution();
        String s="III";
        int res=sol.romanToInt(s);
        System.out.println(res);
    }
}