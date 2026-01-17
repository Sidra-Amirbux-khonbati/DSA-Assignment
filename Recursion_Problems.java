public class Recursion_Problems {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8};

        System.out.println("Factorial of 5: " +factorial(5));

        System.out.println("Fabonacci number at position 6 is " +fabonacci(6));

        System.out.println("Sum of all Elements in array is " +sumArray(arr,0));

        int arrSort[] = {3,5,7,9};
        System.out.println("Is Array sorted: " +isArraySorted(arr,0));
        
        System.out.println("Maximum Element in array is: " +findMax(arr,0,arr[0]));
        System.out.println("Minimum Element in array is: " +findMin(arr,0,arr[0]));
    }

    public static int factorial(int n){
        if(n <= 1){                       //base case
            return 1;
        }
        return n * factorial(n - 1);   //recursive case
    }

    public static int fabonacci(int n){
        if(n == 0){                 //base case
            return 0;
        }
        if(n == 1){                 //base case
            return 1;
        }
        return fabonacci(n-1) + fabonacci(n-2);   //recursive case
    }

    public static int sumArray(int arr[], int index){
        if(index == arr.length){             //base case
            return 0;
        }
        return arr[index] + sumArray(arr,index + 1);   //recursive case
    }

    public static boolean isArraySorted(int arr[], int index){
        if(index == arr.length-1){             //base case
            return true;
        }
        if(arr[index] > arr[index+1]){         //base case
            return false;
        }
        return isArraySorted(arr,index+1);   //recursive case
    }

    public static int findMax(int arr[], int index, int max){
        if(index == arr.length){         //base case
            return max;
        }
        if(arr[index] > max){
           max = arr[index];
        }
        return findMax(arr,index+1,max);         //recursive case
    }

    public static int findMin(int arr[], int index, int min){
        if(index == arr.length){      //base case
            return min;
        }
        if(arr[index] < min){
            min = arr[index];
        }
        return findMin(arr,index+1, min);    //recursive case
    }
}
