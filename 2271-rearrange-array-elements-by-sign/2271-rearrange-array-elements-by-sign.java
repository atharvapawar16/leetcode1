class Solution {

    public static int[] rearrangeArray(int[] arr) {

        int n = arr.length;
        int[] ans = new int[n];
        int posIndex = 0, negIndex = 1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans[posIndex] = arr[i];
                posIndex += 2;
            } else {
                ans[negIndex] = arr[i];
                negIndex += 2;
            }
        }
        return ans;
    }
}
