class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];

        // calculate the prefixs
        output[0] = 1;
        for (int i = 1; i < n; i++ ){
            output[i] = nums[i-1] * output[i-1];
        }

        // calculate the pstfixs and the result 
        int postfix = 1;
        for (int i = n-1; i >= 0; i--) {
            output[i] *= postfix;
            postfix *= nums[i];
        }

        return output;
    }
}  
