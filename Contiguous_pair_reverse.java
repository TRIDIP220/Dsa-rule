/*package whatever //do not write package name here */

import java.io.*;




class GFG {
    
    
    public static void contiguous(int arr[] , int n){
        
        
        for(int i=0 ; i<n ; i++){
            
            int start = i;
            
            
            
            for(int j=i ; j<n ; j++)
            {
             int end = j;
                
            for(int k=start ; k<=end ; k++){
                
                System.out.print(arr[k]+" ");
            }
            System.out.println(" ");
            
                
            }
            
            System.out.println(" ");
                
           
        }

    }
    
    public static void pair(int arr[] , int n){
        
        
        for(int i =0 ; i<n ; i++){
            
            int start = arr[i];
            
            for(int j=i+1 ; j<n ; j++){
                
                int end = arr[j];
                
                System.out.print("("+start + "," +end +")");
                
            }
                
            
        }
    }
    
    public static int[] reverse(int arr[] , int start , int end){
    
    
    while(start < end){
        
        int temp = arr[start];
        
        arr[start] = arr[end];
        
        arr[end] = temp;
        
        start++;
        end--;
    }
    
    return arr;
    
    
    
    
    
}
	public static void main (String[] args) {
		
		
		int arr[]={1,2,3,4,5};
	
		
		contiguous(arr , arr.length);
		
		
	}
}
