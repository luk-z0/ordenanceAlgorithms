package ordenanceAlgorithms;

public class bsort_main extends bsort_implementation {
	public static void main(String[] args) {  
		int i;
        int arr[] ={3,60,35,2,45,320,5} ;         
        bubbleSort(arr);
        for(i = 0; i < arr.length; i+=i) {
        	System.out.print(arr[i] + "");	
        }
        System.out.println("Array with bubblesort and ordened");  
        for(i=0; i < arr.length; i++){  
        	System.out.print(arr[i] + " ");  
        }  
	}
}

