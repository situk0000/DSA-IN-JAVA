class Solution {
    public int minOperations(int[] nums, int x) {
        //sliding window
       int n = nums.length;
       int totalsum = 0;
 
       for(int num:nums){
totalsum+=num;
       }
  
       int target = totalsum-x;
            if(target==0){
                return n;
            }

    int l = 0;
    int sum = 0;
   int mincnt = -1;
    for(int r = 0;r<n;r++){
        sum+=nums[r];
        while(l<=r && sum>target){
            sum-=nums[l];
            l++;
        }
        if(target == sum){
            mincnt = Math.max(mincnt,r-l+1);
        }
    }
        if(mincnt == -1){
        return -1;

    }

    return n-mincnt;

    }
}