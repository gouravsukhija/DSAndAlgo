class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int longestSeq=0;
        
        int[] countOfLongestSeq=new int[nums.length];
        
        //intialize the array to 1
        
        for(int i=0; i<nums.length;i++){
            countOfLongestSeq[i]=1;
        }
        
        for(int i=1; i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    countOfLongestSeq[i]=Math.max(countOfLongestSeq[i],countOfLongestSeq[j]+1);
                }else
                    continue;
            }
        }
        
        Arrays.sort(countOfLongestSeq);
        
        if(nums.length>0)
            return countOfLongestSeq[nums.length-1];
        else
            return 0;
    }
    
    //tc cases
    //[10,9,2,5,3,7,101,18]
    //[1,2,3,4,5]
    //[5,4,3,2,1]
    //[]
}