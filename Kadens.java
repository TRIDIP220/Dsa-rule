class Solution{
  
    public static long maxSubarraySum(int[] arr, int n) {
        long ms = Long.MIN_VALUE;
        long cs = 0;
        long over=Long.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            cs = cs + arr[i];
            
            
            if(cs < 0){
                
                cs =0;
            }

           ms = Math.max(cs , ms);
           
           over = Math.max(over , arr[i]);

    }
    
    if(ms == 0){
        
        return over;
        
    }
    
    return ms;
   
    
}

}

