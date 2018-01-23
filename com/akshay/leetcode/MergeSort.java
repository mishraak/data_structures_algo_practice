package com.akshay.leetcode;

class MergeSort
{
	
	void merge(int[] arr, int l, int m, int r) {
		int[] la = new int[m-l+1];
		int[] ra = new int[r-m];
		
		for(int i=0; i<=m-l; i++) la[i]=arr[l+i];
		for(int i=0; i<r-m; i++) ra[i]=arr[m+1+i];
		
		int i=0,j=0; //initial indexes of the sub arrays
		int k=l;     //initial index of merged sub arrays
		
		while(i<=m-l && j<r-m) {
			if(la[i] < ra[j]) arr[k++]=la[i++];									
			else arr[k++]=ra[j++];														
		}
		
		while(i<=m-l) arr[k++]=la[i++];
		while(j<r-m) arr[k++]=ra[j++];		
	}
	
	
    void mergeSort(int arr[], int l, int r)
    	{	
    		if(l<r) {
    			int m=l + (r-l)/2;
    			mergeSort(arr, l, m);
    			mergeSort(arr, m+1, r);
    			merge(arr,l,m,r);
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
 
        MergeSort ob = new MergeSort();        
        ob.mergeSort(arr,0,arr.length-1);
                 
        printArray(arr);
    }
} 
