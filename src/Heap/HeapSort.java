//Name: Prawal Pokharel
//Class: 21F 67727 - CSCI308-A-ADV DATA STRUCTURS,ALGORTHMS I
//Date: 10/18/2021

package Heap;

public class HeapSort {
    public void sort(Integer[] arr) {
        System.out.println("Sorting Process started......");
        int n = arr.length;
        int j = 1;
        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
            System.out.println("Heap Sort Step: " + j);
            j = j + 1; // Counting number of steps
            UserInterface.printArray(arr);
        }
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(Integer[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapifying the sub-tree
            heapify(arr, n, largest);
        }
    }
}
