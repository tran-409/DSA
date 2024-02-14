package leetCodes;

import java.util.HashMap;

public class twoSumHash {
	
	public int[] twoSums(int [] nums, int target) {
		HashMap<Integer, Integer> complement = new HashMap<>();
		
		for(int i = 0; i < nums.length; i++) {
			int indexComp = target - nums[i];
			if(complement.containsKey(indexComp)) {
				return new int[] {complement.get(indexComp)};
			}
			complement.put(nums[i], i);
		}
		return nums;
	}
	
}
