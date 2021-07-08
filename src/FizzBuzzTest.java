import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

	@Test
	public void FizzBuzz() {
        FizzBuzz a = new FizzBuzz();
        Map<Integer, String> map = new HashMap<>()
		{{
			put(1, "");
			put(3, "Fizz");
			put(25, "Buzz");
			put(60, "FizzBuzz");
			put(23, "Fizz");
		}};
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			assertEquals(entry.getValue(), a.sayFizzBuzz().get(entry.getKey()));
		}
	}
}
