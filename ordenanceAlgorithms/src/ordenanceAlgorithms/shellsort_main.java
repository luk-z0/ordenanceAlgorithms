package ordenanceAlgorithms;
import java.util.Arrays;
public class shellsort_main {
	public static void main(String args[]) {
		int[] data = { 9, 8, 3, 7, 5, 6, 4, 1 };
		int size = data.length;
		shellsort_implementation ss = new shellsort_implementation();
		ss.shellSort(data, size);
		System.out.println("Ordered by shell sort algorithm: ");
		System.out.println(Arrays.toString(data));
		}
}
