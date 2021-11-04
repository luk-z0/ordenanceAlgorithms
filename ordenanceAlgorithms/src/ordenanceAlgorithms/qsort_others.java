package ordenanceAlgorithms;

import java.util.Arrays;

public class qsort_others extends qsort_implementation{
	public static void main(String[] args) {
        Integer[] array = new Integer[] { 12, 13, 24, 10, 3, 6, 90, 70 };
        quickSort( array, 0, array.length - 1 );
        System.out.println(Arrays.toString(array));
    }
}
    

