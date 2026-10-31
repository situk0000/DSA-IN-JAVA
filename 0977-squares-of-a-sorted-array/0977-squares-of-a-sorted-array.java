class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int[] ans = new int[n];
        while(left<=right){
if(nums[left]*nums[left]>=nums[right]*nums[right]){
    ans[n-1] = nums[left]*nums[left];
    left++;

}else{
    ans[n-1] = nums[right]*nums[right];
    right--;
}
n--;
        }
        return ans;
    }
}