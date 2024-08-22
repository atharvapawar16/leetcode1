class Solution {
    public void nextPermutation(int[] nums) {
        int ind = -1;
        int n = nums.length;
        
        // Step 1: Find the first index 'ind' from the end where nums[ind] < nums[ind + 1]
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }

        // Step 2: If no such index exists, reverse the whole array (last permutation case)
        if (ind == -1) {
            reverse(nums, 0, n - 1);
        } else {
            // Step 3: Find the smallest element greater than nums[ind] to the right of ind
            for (int i = n - 1; i > ind; i--) {
                if (nums[i] > nums[ind]) {
                    // Step 4: Swap them
                    swap(nums, ind, i);
                    break;
                }
            }
            // Step 5: Reverse the elements to the right of ind
            reverse(nums, ind + 1, n - 1);
        }
    }

    // Helper method to reverse elements in an array between two indices
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    // Helper method to swap elements in an array
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3};
        solution.nextPermutation(nums);

        System.out.println("Next permutation:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
