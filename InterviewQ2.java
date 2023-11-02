import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterviewQ2 {

	public static void main(String[] args) {
		
		String input = "venkateshvedha";
		
		//find the each character's occurrence
		Map<Character,Long> result = input.chars()
		.mapToObj(str->Character.toLowerCase((char)str))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		//find the first non repeated occurrence
		Optional<Entry<Character, Long>> result2 = input.chars()
				.mapToObj(str->Character.toLowerCase((char)str))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().filter(s->s.getValue()==1L).findFirst();
		System.out.println(result);
		System.out.println(result2.get());
		
		//find the each occurrence of each number
		List<Integer> arr = Arrays.asList(1,1,1,2,3,4,4,2,3);
		Map<Integer,Long> map = arr.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
	}

}
