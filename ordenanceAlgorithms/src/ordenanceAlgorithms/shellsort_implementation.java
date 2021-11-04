package ordenanceAlgorithms;
import java.util.Arrays;
public class shellsort_implementation {

public void shellSort(int array[], int n) {
	for (int intervalo = n / 2; intervalo > 0; intervalo /= 2) {
		for (int i = intervalo; i < n; i += 1) {
			int temp = array[i];
			int j;
			for (j = i; j >= intervalo && array[j - intervalo] > temp; j -= intervalo) {
				array[j] = array[j - intervalo];
				}
			array[j] = temp;
		}
	}
}
}