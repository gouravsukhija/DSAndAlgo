public class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        //int len = 0;
        
        for(int i=0; i<dp.length;i++){
            
            dp[i]=Integer.MAX_VALUE;
            
        }
        for (int num : nums) {
            int i = Arrays.binarySearch(dp, 0, nums.length, num);
            if (i < 0) {
                i = -(i + 1);
            }
            dp[i] = num;
           // if (i == len) {
             //   len++;
            //}
        }
        
        System.out.println(Arrays.toString(dp));
        return 0;
    }
}