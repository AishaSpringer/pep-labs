public class GetMax {
    /**
     * This method should return the max value of arr (the largest int.)
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints to be manipulated.
     * @return the largest value in arr.
     */
    public int max(int[] arr){
        int i = 0;
        Map<String, Integer> max = new HashMap<>();
        for (i = 1; i < arr.length; i++) {
            max.put(int[i], arr[i]);
        }
        return i;
    }
}
