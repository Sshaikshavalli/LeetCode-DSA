class Solution {
    public boolean isPalindrome(int x) {
    if(x < 0)
    return false;
    int original=x;
    int reversed=0;
    while(x > 0 ) {
        int digit=x%10;
         reversed=reversed*10+digit;
        x/=10;
    }
    return original==reversed;
}
}
public class Main{
public static void main (String[] args){
     Solution sol=new Solution();
    Scanner scan=new Scanner(System.in);
    int x=scan.nextInt();
   boolean result= sol.isPalindrome(x);
   System.out.println(result);
}
}