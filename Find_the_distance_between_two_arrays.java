class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int count =0;
        for(int i = 0 ; i<arr1.length;i++){
            int x = arr1[i];
            int low = arr1[i] - d;
            int high = arr1[i] + d;
            boolean abhi =  true;
            int j =  0;
            while(j<arr2.length){
                if(arr2[j] >=low && arr2[j] <=high){
                    abhi  = false;
                    break;
                }
                j++;
            }
            if(abhi){
                count ++;
            }
        }
            return count;
    }

}
