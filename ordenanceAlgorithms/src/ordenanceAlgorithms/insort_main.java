package ordenanceAlgorithms;

import java.util.Arrays;

public class insort_main {
	public static void main(String args[]) {
		int[] data = { 9, 5, 1, 4, 3 }; //Array test
		isort_implementation is = new isort_implementation();
		is.insertionSort(data);
		System.out.println("Array ordened by insertion sort algorithm: " +  "\n---------------" );
		System.out.println(Arrays.toString(data));
		}
}
