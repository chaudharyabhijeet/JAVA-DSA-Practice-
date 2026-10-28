public class binarysearchofdecendingsortedarray {
  public static void main(String[] args) {
    int[] arr = {100,91,87,76,66,52,43,35,29,13,5};
    int i = 0 ;
    int j = arr.length-1;
    boolean found = false ;
    int target = 45;
    while(i<=j)
    {
        int mid = (i+j) / 2;
        if(arr[mid] == target){
             found = true;
            break;
        }else if(arr[mid] > target){
            i = mid + 1;
        }else{
            j = mid -1;
        }
    }
    if(found){
        System.out.println("Elemnt is found");
    }else{
        System.out.println("Elemnt is not found");
    }
  }
}
