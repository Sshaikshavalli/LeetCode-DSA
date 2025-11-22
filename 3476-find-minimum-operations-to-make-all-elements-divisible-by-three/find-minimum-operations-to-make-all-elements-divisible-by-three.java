class Solution {
    public int minimumOperations(int[] nums) {
         int operation=0;
         for(int x:nums){
            int remainder=x%3;
            operation+=Math.min(remainder,3-remainder);
         }
         return operation;
    }
}