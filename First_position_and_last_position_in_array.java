class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = -1 , last = -1;
        int j = nums.length-1;
        int i = 0;
        while(i<=j){ // First occurence //
            int mid = (i+j) / 2;
            if(nums[mid] < target ){
                i = mid +1;
            }else if (nums[mid] > target){
                j = mid -1;
            }else {
                first = mid ;
                j = mid -1;
            }
        }
        i = 0 ;
        j = nums.length-1; // Last occurence
        while(i<=j){
            int mid = (i+j) / 2;
            if(nums[mid]  == target){
                last = mid ;
                i = mid +1;
            }else if(nums[mid] > target){
                j = mid -1;
            }else{
                i = mid +1;
            }
        }
        return new int[]{first , last};
    }
}
