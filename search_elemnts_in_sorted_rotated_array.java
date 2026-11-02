class Solution {
    public int search(int[] arr, int target) {
        int n = arr.length;
        int lo = 0 ; 
        int hi = n-1;
        while(lo<=hi){
            int mid = (lo + hi) / 2;
            if(arr[mid] == target) return mid ;
        else if(arr[lo] <= arr[mid]){ // left array sorted check//
                  if(arr[lo] <= target && target <= arr[mid]) hi = mid -1;
                  else lo  = mid +1;
        }  else{ // check if right array is sorted or not //
                    
                  if(arr[mid] <= target && target <= arr[hi]) lo = mid +1;
                  else hi  = mid - 1;
             }
        }
        return -1;
    }
}
