class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        
        
        ArrayList<Integer> list = new ArrayList<>();
        int curr_leader = arr[n-1];
        list.add(curr_leader);
        
        for(int i= n-2 ; i>=0 ; i--){
            
            
            if(arr[i] > curr_leader){
                
                
                curr_leader = arr[i];
                
                list.add(curr_leader);
                
    
            }
            
            
        }
        Collections.reverse(list);
        
        
        return list;
    }
}
