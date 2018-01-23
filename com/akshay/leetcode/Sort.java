package com.akshay.leetcode;

class Sort
{
	
	
	// The last elements are always sorted. Array is sorted from behind and if there are any elements 
	//which are smaller than the first sorted element from the last set of sorted elements, then it is swapped.
    /*Function to sort array using bubble sort*/
    void bubbleSort(int arr[])
    {
		System.out.println("Bubble Sort");
    		for(int i=arr.length-1; i>=0; i--) {
    			for(int j=1; j<=i ; j++ ) {
    				if(arr[j-1] > arr[j]) {
    					int temp = arr[j-1];
    					arr[j-1] = arr[j];
    					arr[j]=temp;
    				}
    			}
    		}

    }
    
    //Elements are selected one by one and a min is found from the remaining elements. That min is swapped with
    //the current element. First few elements are sorted always as the sorting algorithm works from the front.
    /*Function to sort array using Selection sort*/
    void selectionSort(int arr[])
    {
		System.out.println("Selection Sort");
    		for(int i=0; i<arr.length; i++) {
    			int min=i;
    			for(int j=i+1; j<arr.length; j++) {
    				if(arr[j]<arr[min]) min=j;
    			}
    			int temp=arr[min];
    			arr[min]=arr[i];
    			arr[i]=temp;
    		}    	
    }
    
    //The elements are selected one by one and stored its values in key, any elements before them, if found out to be greater, then 
    //those elements are shifted one place above and key is inserted when the while loop that checks this is exited.
    /*Function to sort array using Insertion sort*/
    void insertionSort(int arr[])
    	{	for(int i=1; i<arr.length; i++) {
    			int key=arr[i];
    			int j=i-1;
    			
    			while(j>=0 && arr[j]>key) {
    				arr[j+1]=arr[j];
    				j--;
    			}
    			arr[j+1]=key;
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
 
        Sort ob = new Sort();        
        //ob.bubbleSort(arr);
//        ob.selectionSort(arr);
        ob.insertionSort(arr);
        
         
        printArray(arr);
    }
} 