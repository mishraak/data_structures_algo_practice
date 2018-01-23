package com.akshay.leetcode;

public class QuickSort {
	static int partition(int[] arr, int l, int h) {
		int i=l-1;
		int pivot=arr[h];
		
		for(int j=l; j<h; j++ ) {
			if(arr[j]<pivot) {
				i++;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;				
			}
		}
		
		int temp=arr[i+1];
		arr[i+1]=arr[h];
		arr[h]=temp;
		
		return i+1;
	}
	
	
    void quickSort(int arr[], int l, int r)
    	{	
    		if(l<r) {
    			int pivot = partition(arr,l,r);    			
    			quickSort(arr,l,pivot-1);
    			quickSort(arr,pivot+1,r);
    		}
    		 		    		
    }
    
    /* A utility function to print array of size n*/
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
 
    // Driver method
    public static void main(String args[])
    {        
        int arr[] = {12, 11, 13, 5, 6};
 
        QuickSort ob = new QuickSort();        
        ob.quickSort(arr,0,arr.length-1);
                 
        printArray(arr);
    }
}
