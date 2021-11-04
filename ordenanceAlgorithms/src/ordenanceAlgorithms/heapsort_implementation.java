package ordenanceAlgorithms;
//import java.util.Arrays;

public class heapsort_implementation {
	  
    public void sort(int arr[]) {
      int n = arr.length;

      for (int i = n / 2 - 1; i >= 0; i--) {
        heapify1(arr, n, i);
      }
  
      // Heap sort
      for (int i = n - 1; i >= 0; i--) {
        int temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;
  
        // Heapify root element
        heapify1(arr, i, 0);
      }
    }
  
    void heapify1(int arr[], int n, int i) {
      // Find largest among root, left child and right child
      int largest = i;
      int l = 2 * i + 1;
      int r = 2 * i + 2;
  
      if (l < n && arr[l] > arr[largest])
        largest = l;
  
      if (r < n && arr[r] > arr[largest])
        largest = r;
  
      // Swap and continue heapifying if root is not largest
      if (largest != i) {
        int swap = arr[i];
        arr[i] = arr[largest];
        arr[largest] = swap;
  
        heapify1(arr, n, largest);
      }
    }

    static void printArray(int arr[]) {
      int n = arr.length;
      for (int i = 0; i < n; ++i)
        System.out.print(arr[i] + " ");
      System.out.println();
    }

 // To heapify a subtree with node i
 void heapify(int arrA[], int heapSize, int i) {
 int largest = i; // Initialize largest as root
 int leftChildIdx = 2*i + 1; // left = 2*i + 1
 int rightChildIdx = 2*i + 2; // right = 2*i + 2

 // If left child is larger than root
 if (leftChildIdx < heapSize && arrA[leftChildIdx ] > arrA[largest])
 largest = leftChildIdx ;

 // If right child is larger than largest so far
 if (rightChildIdx < heapSize && arrA[rightChildIdx ] > arrA[largest])
 largest = rightChildIdx ;

 // If largest is not root
 if (largest != i) {
 int swap = arrA[i];
 arrA[i] = arrA[largest];
 arrA[largest] = swap;

 // Recursive call to heapify the sub-tree
 heapify1(arrA, heapSize, largest);
 }
 }

}

	
