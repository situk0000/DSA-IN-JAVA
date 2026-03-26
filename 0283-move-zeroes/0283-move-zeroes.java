class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int [] temp = new int[n];
        int j = 0; //counter for non-zero elements
    for(int i = 0; i<n;i++){
        if(nums[i] != 0){
             temp[j++] = nums[i];
        } }
        for(int i = 0;i<j;i++){
            nums[i] = temp[i]; //Copy Back to Original Array
                               //Copy only non-zero elements back
        }
        for(int i = j;i<n;i++){
            nums[i] = 0; //Fill rest positions with 0
        }
    }
    }
