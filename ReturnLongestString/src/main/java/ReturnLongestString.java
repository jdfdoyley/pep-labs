public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties
     *         for the longest string.
     */
    public String longest(String[] arr) {
        // 1. Loop through the array
        // 2. Assign the length of the first element in the array to a variable called
        // len
        // 3. Compare the second element's length with the length variable
        // 4. Update the length variable with the current element's length if greater
        // 5. Assign the index of the current element to the index variable
        // 6. Continue until the end of the array
        // 7. Return the string using the index of the element with the longest string
        int index = 0, len = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                len = arr[i].length();
            }

            if (arr[i].length() > len) {
                len = arr[i].length();
                index = i;
            }
        }
        return arr[index];
    }
}
