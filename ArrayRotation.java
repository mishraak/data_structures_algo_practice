//http://www.geeksforgeeks.org/array-rotation/
public class ArrayRotation {
    public static void main(String args[]) {
        int[] arr = new int[]{1,2,3,4,5,6};
        int k=3;
        for(int i : rotate(arr, k, arr.length) )  {
            System.out.println(i);
        }
    }
    
    public static int[] rotate(int[] arr, int k, int n){
        int first=arr[0], second=arr[1], third=arr[2];
        for(int i=0; i<n; i++){
            arr[i] = arr[(i+k)%n];
        }
        
        arr[n-3]=first;
        arr[n-2]=second;
        arr[n-1]=third;
        
        return arr;
    }
    
}

