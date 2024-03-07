class Solution {
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        if (n <= 2) {
            return 0; 
        }
        
        int leftBoundary[] = new int[n];
        int rightBoundary[] = new int[n];
        long ans = 0;
        
        leftBoundary[0] = arr[0];
        rightBoundary[n - 1] = arr[n - 1];
        
        for (int i = 1; i < n; i++) {
            leftBoundary[i] = Math.max(leftBoundary[i - 1], arr[i]);
        }
        
        for (int i = n - 2; i >= 0; i--) {
            rightBoundary[i] = Math.max(rightBoundary[i + 1], arr[i]);
        }
        
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftBoundary[i], rightBoundary[i]);
            ans += Math.max(0, waterLevel - arr[i]);
        }
        
        return ans;
    } 
}
