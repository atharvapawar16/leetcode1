
class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length ;
        if(n==0)
        return 0 ;

        int longest = 1 ;
        Set<Integer> set = new HashSet<>();

        // put all array elements into array 
        for(int i =0 ; i< n ; i++){
            set.add(nums[i]);
        }
        
        //find the longest sequence 
        for( int it : set ){
            
            //If it is a  starting number 
            if(!set.contains(it-1)){
                int cnt =1 ;
                int x = it ;
                while(set.contains(x+1)){
                    x= x+1 ;
                    cnt = cnt+1 ;
                }
                longest = Math.max(longest , cnt );
            }
        }
        return longest ;
    }
}