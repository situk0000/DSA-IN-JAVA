class Solution {
    public void rotate(int[] a, int k) {
        int n = a.length;
        k = k % n;
       int[] temp = new int[k];
    

    
        for(int i = 0; i<k;i++){
          temp[i] = a[n-k+i];

        }
        for(int i = n-k-1;i>=0;i--){
            a[i+k] = a[i];
        }
        for(int i=0;i<k;i++){
            a[i] = temp[i];
           
        }
    }
}