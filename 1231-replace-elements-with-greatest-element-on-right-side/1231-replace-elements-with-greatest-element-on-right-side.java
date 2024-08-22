class Solution {
    public int[] replaceElements(int[] arr) {
       int maxi = -1;
       int n = arr.length ;
       int [] ans =  new int[n];

        for(int i = n-1 ; i>=0 ; i--){
            ans[i] = maxi;
            if(arr[i]> maxi){
                maxi = arr[i];
            }

        }
          return ans ;
    } 
}