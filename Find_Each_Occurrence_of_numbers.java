import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Find_Each_Occurrence_of_numbers {
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(1,1,1,2,3,4,4,2,3);
		Map<Integer,Long> map = arr.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
	}
}
