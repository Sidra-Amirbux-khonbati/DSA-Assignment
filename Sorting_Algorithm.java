import java.util.Arrays;
class Sorting_Algorithm {

    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void conquer(int arr[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && idx2 <= ei) {

            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            int pi = partition(arr, low, high);

            // Left half
            quickSort(arr, low, pi - 1);

            // Right half
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int idx = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                idx++;

                swap(arr, j, idx);
            }
        }

        idx++;
        swap(arr, idx, high);

        return idx;
    }

    // Swap function
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};

        // Merge Sort
        // Time Complexity: Best/Average/Worst = O(n log n)
        // Space Complexity: O(n) (extra array for merge)
        // Stable: Yes
        divide(arr, 0, arr.length - 1);
        System.out.println("Merge Sorted Array: " + Arrays.toString(arr));

        //Quick Sort
        // Time Complexity: Best/Average = O(n log n), Worst = O(n^2)
        // Space Complexity: O(log n) average (recursion stack)
        // Stable: No
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Quick Sorted Array: " + Arrays.toString(arr));
    }
}

