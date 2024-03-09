class Solution {
    int findMaxDiff(int a[], int n) {
        if (n < 2) {
            // At least two elements are required for a difference to be calculated.
            return -1;  // Return an error value or handle this case according to your requirements.
        }

        int max_diff = a[1] - a[0];
        int min_value = a[0];

        for (int j = 1; j < n; j++) {
            max_diff = Math.max(max_diff, a[j] - min_value);
            min_value = Math.min(min_value, a[j]);
        }

        return max_diff;
    }
}
