package ordenanceAlgorithms;
import java.util.Arrays;
class isort_implementation {

  void insertionSort(int arr[]) {
    int tamanho = arr.length;
    for (int pos = 1; pos < tamanho; pos++) {
      int key = arr[pos];
      int j = pos - 1;
      while (j >= 0 && key < arr[j]) {
    	  arr[j + 1] = arr[j];
        --j;
      }
      arr[j + 1] = key;
    }
  }
}

