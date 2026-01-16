public class BinarySearch_Recursive {
    public static void main(String[] args) {
        int arr[] = {3,8,12,20,25,30};
        int low = 0;
        int high = arr.length;
        int key = 25;
        System.out.println("Element " +key+ " at index [" +binarySearch(low,high,arr,key) +"]");
    }

    public static int binarySearch(int low, int high, int arr[], int key){
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == key){
                return mid;
            }else if(arr[mid] > key){
                return binarySearch(low,mid-1,arr,key);
            }else{
                return binarySearch(mid+1, high, arr, key);
            }
        }
        return -1;
    }
}
