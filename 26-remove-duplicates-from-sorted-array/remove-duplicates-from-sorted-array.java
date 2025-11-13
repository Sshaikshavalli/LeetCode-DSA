class Solution {
    public int removeDuplicates(int[] nums) {
       
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[count]!=nums[i]){
             count++;
             nums[count]=nums[i];
            }
        }
        return count+1;

     }
        
    }
public class Main{
public static void main(String[] args){
    
    Solution sol=new Solution();
    int[] nums={1,1,2};
    int res=sol.removeDuplicates(nums);
   System.out.println(res);
 
   }
}
