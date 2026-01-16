public class LinearSearch_Recursive {
    public static void main(String[] args) {
        int arr[] = {3,8,12,20,25,30};
        int key = 12;
        int index = linearSearch(arr,key);
        if(index != -1) {
            System.out.println("Element found at index [" + index + "]");
        }else{
            System.out.println("Element are not found!");
        }
        }

    public static int linearSearch(int arr[], int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}
