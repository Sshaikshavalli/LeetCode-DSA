class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        long nf=Long.MAX_VALUE/2;
        long[] minpre=new long[k];

        for(int i=0;i<k;++i)
            minpre[i]=nf;
            minpre[0]=0L;

            long pref=0L;
            long maxsum=Long.MIN_VALUE;
            for(int j=1;j<=nums.length;++j){
          pref+= nums[j-1];
          int r=j%k;
          if(minpre[r]!=nf){
            maxsum=Math.max(maxsum,pref-minpre[r]);
          }
          minpre[r]=Math.min(minpre[r],pref);
            }
            return maxsum;


        }
}