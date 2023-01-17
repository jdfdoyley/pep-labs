//see test cases.
public class ArraysAreEqual {
    /**
     * Check if two arrays are equal to each other. Return true if all of the values
     * in a are identical to the ones in b, and false otherwise. So, {1,2,3,4} is
     * equal only to {1,2,3,4}.
     *
     * Note: attempting to solve this problem with an expression like array1==array2
     * will not work, because even though the arrays may be equivalent, they can
     * occupy different positions in memory, which will cause a==b to fail. When
     * working with Objects (arrays are special objects,) == just compares locations
     * in memory. Object1 == Object2 is only true when they are literally the same
     * object in memory.
     *
     * @param a the first array.
     * @param b the second array.
     * @return true if the values of a are equal to the values of b.
     */
    public boolean equal(int[] a, int[] b) {
        int count = 0; // track how many items are equal
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i])
                count++; // if equal, add 1 to count otherwise move to the next
            else
                break; // break out the loop
        }

        // if the value of count is equal to the length of the array a, then they
        // are equal, so return true, otherwise return false
        return count == a.length ? true : false;
    }
}
