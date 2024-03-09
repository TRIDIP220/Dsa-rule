class Solution {
    
    public void swap(int arr[] , int a , int b){
        
        
        if((a >=0 && a <arr.length)&&(b >=0 && b < arr.length)){
            
        int temp = arr[a];
        
        arr[a]= arr[b];
        
        arr[b] = temp;
        }
        
        
    }
    void pushZerosToEnd(int[] arr, int n) {
        
        
        int count = 0;
        
        for(int i=0 ; i<n ; i++){
            
            if(arr[i] !=0){
                
                
                swap(arr ,i , count);
                
                count++;
            }
            
        }
    }
}
