public class FindMinMax_Recursive {
    public static void main(String[] args) {
        int arr[] = {3,8,12,20,25,30};
        int index = 0;
        System.out.println("Minimum value at index [" +FindMin(arr,index)+ "]");
        System.out.println("Maximum value at index [" +FindMax(arr,index)+ "]");
    }
    public static int FindMax(int arr[], int index) {
        if(index == arr.length-1){
            return arr[index];
        }
        int maximum = FindMax(arr,index+1);

        if(arr[index] > maximum){
            return arr[index];
        }else{
            return maximum;
        }
    }
    public static int FindMin(int arr[], int index){
        if (index == arr.length-1) {
            return arr[index];
        }
        int Minimum = FindMin(arr, index+1);
        if(arr[index] < Minimum){
            return arr[index];
        }else{
            return Minimum;
        }
    }
}
