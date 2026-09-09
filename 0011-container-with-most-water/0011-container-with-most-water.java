class Solution {
    public int maxArea(int[] height) {
       int maxarea = 0;
       int n = height.length;
       int left = 0;
       int right = n-1;
       while(left<right){
        int area = Math.min(height[left],height[right])*(right-left);
      maxarea = Math.max(maxarea,area);
       
       if(height[left]>height[right]){
        right--;
       }else{
        left++;
       }
    }
return maxarea;
    }
}