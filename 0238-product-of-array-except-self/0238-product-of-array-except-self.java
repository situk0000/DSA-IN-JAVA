/*class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prefixProduct = 1;
        int suffixProduct = 1;
        int[] result = new int[nums.length];

        for(int i = 0;i<n;i++){
            result[i] = prefixProduct;
            prefixProduct *= nums[i];

        }
        for(int i = n-1; i >= 0; i--) {
            result[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }
        return result;
    }
}
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
int n = nums.length;
int prefix = 1;
int sufix = 1;
int[] ans = new int[n];
for(int i = 0;i<n;i++){
    ans[i] = prefix;
    prefix *= nums[i];
}
for(int i = n-1;i>=0;i--){
    ans[i] *= sufix;
    sufix *= nums[i];
}
return ans;
    }
    
    }