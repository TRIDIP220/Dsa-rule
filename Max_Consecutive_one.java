public static int maxConsecutiveOnes(int n) {
        
        
        int binary[] = decimal_to_binary(n);
    
        int res = 0;
        
        int count =0;
        
        for(int i=0 ; i<n ; i++){
            
            
            if(binary[i] == 0){
                
                count =0;
            }
            else{
                
                count++;
                
                res = Math.max(res , count);
            }
        }
        
        return res;
    }
}
