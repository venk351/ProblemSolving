/*Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109 */
  
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MajorityElement {

	public static void main(String[] args) {
		int nums[] = {2,2,1,1,1,2,2};
		int n = nums.length;
		List<Integer> list = new ArrayList<>();
		for(int i : nums) {
			list.add(i);
		}
		Map<Integer,Long> amp = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		for(Entry<Integer, Long> map : amp.entrySet()) {
			if(map.getValue()>n/2) {
				System.out.println(map.getKey());
			}
		}
	}

}
 
