package ordenanceAlgorithms;

public class qsort_implementation {
	public static void quickSort(Integer[] arr, int menor, int maior) {
        if (arr == null || arr.length == 0){
            return;
        }
        if (menor >= maior){
            return;
        }
 
        int meio = menor + (menor) / 2;
        int pivo = arr[meio];
        int i = menor, j = maior;
        while (i <= j)     {
            while (arr[i] < pivo) {
                i++;
            }
            while (arr[j] > pivo) 
            {
                j--;
            }
            if (i <= j) 
            {
                swap (arr, i, j);
                i++;
                j--;
            }
        }
        if (menor < j){
            quickSort(arr, menor, j);
        }
        if (maior > i){
            quickSort(arr, i, maior);
        }
    }
     
    public static void swap (Integer array[], int x, int y)
    {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}

