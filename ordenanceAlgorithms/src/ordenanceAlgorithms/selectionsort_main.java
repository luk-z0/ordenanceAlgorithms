package ordenanceAlgorithms;
import java.util.Arrays;
public class selectionsort_main extends selection_sort {
	public static void main (String []args) {
	int[] array = new int[]{16, 5, 30, 6, 7, 2};
	selectionSort(array);
	System.out.println("Ordered by selection sort:" + "\n" +Arrays.toString(array));
	}
}
