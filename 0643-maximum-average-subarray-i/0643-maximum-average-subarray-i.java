class Solution {
    public double findMaxAverage(int[] nums, int k) {
      int n = nums.length;
int sum =0;
      for(int i = 0;i<k;i++){
   sum += nums[i];
      }
      int max = sum;
      for(int j = k;j<n;j++){
       sum += nums[j];
        sum -= nums[j-k];
        
      max = Math.max(max,sum);

      }
      return (double) max / (double) k;

    }
}