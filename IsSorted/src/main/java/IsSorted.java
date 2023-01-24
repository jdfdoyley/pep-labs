public class IsSorted {
    /**
     * Return true if arr is sorted, smallest to largest, false otherwise.
     * For example, {1,2,3,4} is storted but {1,2,4,3} is unsorted
     *
     * @param arr an int array
     * @return true if arr is sorted (all the numbers are in order). false if arr is
     *         not sorted.
     */
    public boolean checkSort(int[] arr) {
        // 1. Check if arr[0] is greater than arr[0]
        // 2. If arr[0] is greater, then return false
        // 3. Otherwise, continue to loop to through the arr and repeat comparison
        // 4. Return true
        for (int i = 0; i < arr.length; i++) {
            // Check to make sure the i + 1 is not equal the length of the array
            // If it equals the length of the array, it will produce an array out
            // of bound exception
            if (i + 1 != arr.length) {
                if (arr[i] > arr[i + 1])
                    return false;
            }
        }
        return true;
    }
}
