import java.util.Arrays;

public class Sort {
    // swap method takes arr, indexOne and indexTwo and swaps them
    public static void swap(int[] arr, int indexOne, int indexTwo) {
        // set temp variable to arr[indexTwo]
        int temp = arr[indexTwo];
        // set indexTwo to indexOne
        arr[indexTwo] = arr[indexOne];
        // set indexOne to temp
        arr[indexOne] = temp;
    }

    // bubble sort take int arr and returns sorted int arr
    public static int[] bubbleSort(int input[]) {
        // set swapping to true
        boolean swapping = true;
        // while swapping
        while (swapping) {
            // set swapping to false
            swapping = false;
            // for i less than input lenght
            for (int i = 0; i < input.length - 1; i++) {
                // if input at index is greater than the next index
                if (input[i] > input[i + 1]) {
                    // call swap
                    swap(input, i, i + 1);
                    // set swapping to true
                    swapping = true;
                }
            }
        }
        // return sorted input
        return input;
    }

    public static void main (String[] args) {
        // set exampleArr
        int[] exampleArr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        // print exampleArr before sort
        System.out.println("Before: " + Arrays.toString(exampleArr));
        // print exampleArr after sort
        System.out.println("After Bubble Sort: " + Arrays.toString(bubbleSort(exampleArr)));
    }
}
