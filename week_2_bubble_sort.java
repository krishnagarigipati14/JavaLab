public class week_2_bubble_sort {

    public static void BubbleSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Flag to detect if any swap was made
            boolean swapped = false;

            // Inner loop to perform comparisons and swaps
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    // Set swapped to true
                    swapped = true;
                }
            }

            // If no swaps were made in the inner loop, the array is already sorted
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 3, 4, 5};
        BubbleSort(arr);

        // Print sorted array
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
