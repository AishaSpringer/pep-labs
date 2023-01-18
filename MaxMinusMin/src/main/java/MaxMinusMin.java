
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
    int min = Integer.MAX_VALUE;
		if (nums.size() > 0) {

			for (Integer currentNumber : nums) {

				if (min > currentNumber) {
					min = currentNumber;
				}
			}
		}
        
        int max = Integer.MIN_VALUE;
		if (nums.size() > 0) {

			for (Integer currentNumber : nums) {

				if (max < currentNumber) {
					max = currentNumber;
				}
			}
		}
        return max - min;
    }
}
