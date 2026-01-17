class Searching_Algorithms {
    public static void main(String[] args) {

        int[] arr = {3, 8, 12, 20, 25, 30};

        //  Iterative Binary Search (20)
        int task1 = binarySearch_Iterative(arr, 20);
        System.out.println("Binary Search Iterative (20): Index [" + task1+ "]");

        //  Recursive Binary Search (25)
        int task2 = binarySearch_Recursive(arr, 0, arr.length - 1, 25);
        System.out.println("Binary Search Recursive (25): Index [" + task2+ "]");

        //  Recursive Linear Search (12)
        int task3 = linearSearch_Recursive(arr, 0, 12);
        System.out.println("Recursive Linear Search (12): Index [" + task3+ "]");

        //  Min & Max using Recursion
        int min = findMinRecursive(arr, 0, arr[0]);
        int max = findMaxRecursive(arr, 0, arr[0]);

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }

    public static int binarySearch_Iterative(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;
            }else if (arr[mid] > key) {
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return -1;
    }
    //  Binary Search (Recursive) Time Complexity: O(log n) Space Complexity: O(log n)
    public static int binarySearch_Recursive(int arr[], int low, int high, int key) {

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                return binarySearch_Recursive(arr, low, mid - 1, key);
            } else {
                return binarySearch_Recursive(arr, mid + 1, high, key);
            }
        }
        return -1;
    }
    // Recursive Linear Search Time Complexity: O(n) Space Complexity: O(n)
    public static int linearSearch_Recursive(int[] arr, int index, int key) {

        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == key) {
            return index;
        }
        return linearSearch_Recursive(arr, index + 1, key);
    }

    // Find Minimum using Recursion Time Complexity: O(n) Space Complexity: O(n)
    public static int findMinRecursive(int[] arr, int index, int min) {

        if (index == arr.length) {
            return min;
        }
        if (arr[index] < min) {
            min = arr[index];
        }
        return findMinRecursive(arr, index + 1, min);
    }

    // Find Maximum using Recursion Time Complexity: O(n) Space Complexity: O(n)
    static int findMaxRecursive(int[] arr, int index, int max) {

        if (index == arr.length) {
            return max;
        }
        if (arr[index] > max) {
            max = arr[index];
        }
        return findMaxRecursive(arr, index + 1, max);
    }
}