public class BinarySearch_Iterative {
    public static void main(String[] args) {
        int arr[] = {3,8,12,20,25,30};
        int key = 20;
        System.out.println("Element "+key+ " find at index [" +binarySearch(arr,key) +"]");
    }

    public static int binarySearch(int arr[], int key){
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == key){
                return mid;
            }else if(arr[mid] > key){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }
}
