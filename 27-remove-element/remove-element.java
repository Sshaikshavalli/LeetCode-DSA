class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; 

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int k = sol.removeElement(nums, val);

        System.out.println("k = " + k);
        System.out.print("nums = [");
        for (int i = 0; i < nums.length; i++) {
            if (i < k) {
                System.out.print(nums[i] + " ");
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println("]");
    }
}
