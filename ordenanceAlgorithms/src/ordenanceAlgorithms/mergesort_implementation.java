package ordenanceAlgorithms;

public class mergesort_implementation {

	  public static void merge(int[] esq,int[] dir, int[] arr,int tamEsq, int tamDir){
	      
	      int i=0,l=0,r = 0;
	      while(l<tamEsq && r<tamDir){
	          
	          if(esq[l]<dir[r]){
	              arr[i++] = esq[l++];
	          }
	          else{
	              arr[i++] = dir[r++];
	          }
	      }
	      while(l<tamEsq){
	          arr[i++] = esq[l++];
	      }
	      while(r<tamDir){
	        arr[i++] = dir[r++];
	      }
	  }

	  public static void mergeSort(int [] arr, int tam){
	      if (tam < 2){return;}
	      
	      int mid = tam / 2;
	      int [] arrayEsquerda = new int[mid];
	      int [] arrayDireita = new int[tam-mid];
	      
	      int k = 0;
	      for(int i = 0;i<tam;++i){
	          if(i<mid){
	        	  arrayEsquerda[i] = arr[i];
	          }
	          else{
	        	  arrayDireita[k] = arr[i];
	              k = k+1;
	          }
	      }
	    
	      mergeSort(arrayEsquerda,mid);
	      mergeSort(arrayDireita,tam-mid);
	      merge(arrayEsquerda,arrayDireita,arr,mid,tam-mid);
	  }

}
