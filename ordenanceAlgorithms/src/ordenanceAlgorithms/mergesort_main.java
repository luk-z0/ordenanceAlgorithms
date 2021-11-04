package ordenanceAlgorithms;

public class mergesort_main extends mergesort_implementation {
	  public static void main( String args[] ) {
	        int [] array = {12,1,10,50,5,15,45};
	        mergeSort(array,array.length);
	        System.out.print("Ordered by mergesort algorithm: " +" \n ");
	        for(int i =0; i< array.length;++i){
	        	
	            System.out.print(array[i]+ " ");
	        }
	    }
	}

