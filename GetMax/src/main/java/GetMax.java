public class GetMax {
    /**
     * This method should return the max value of arr (the largest int.)
     * This problem will require you to use a for loop. No other guidance will be
     * provided.
     *
     * @param arr an array of ints to be manipulated.
     * @return the largest value in arr.
     */
    public int max(int[] arr) {
        int maxValue = 0;
        for (int i = 0; i < arr.length; i++) {
            // re-initialize maxValue with the first element
            // in the array on the first iteration
            if (i == 0) {
                maxValue = arr[i];
                continue;
            }
            // check if the value at index position i is greater than
            // the current value in maxValue
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
