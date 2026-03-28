class Solution {
    public void rotate(int[] a, int k) {
        int n = a.length;
        k = k % n;
       int[] temp = new int[k];
    
        for(int i = 0; i<k;i++){
          temp[i] = a[n-k+i];        //temp = [5,6,7]

        }
        for(int i = n-k-1;i>=0;i--){  //After shift:  // [1,2,3,4,1,2,3,4]
            a[i+k] = a[i];
        }
        for(int i=0;i<k;i++){
            a[i] = temp[i];  //ab aage ke elements ko 'temp' se replace krdo!
           
        }
    }
}