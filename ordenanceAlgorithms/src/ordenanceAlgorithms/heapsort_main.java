package ordenanceAlgorithms;

public class heapsort_main extends heapsort_implementation{
	public static void main(String args[]) {
	      int arr[] = { 1, 12, 9, 5, 6, 10 };
	  
	      heapsort_implementation hs = new heapsort_implementation();
	      hs.sort(arr);
	  
	      System.out.println("Heapsorted ordenation");
	      printArray(arr);
	}
}
