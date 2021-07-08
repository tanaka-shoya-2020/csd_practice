import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBazzTest {

	@Test
	public void FizzBazz() {
        FizzBazz a = new FizzBazz();
		Map<Integer,String> fizzBazz = a.sayFizzBazz();
		for(Map.Entry<Integer, String> entry : fizzBazz.entrySet()) {
		  if (entry.getKey() % 15 == 0) {
				assertEquals("FizzBazz", entry.getValue());
			} else if (entry.getKey() % 3 == 0 || entry.getKey() % 10  == 3) {
		  		assertEquals("Fizz", entry.getValue());
			} else if (entry.getKey() % 5 == 0) {
			  	assertEquals("Bazz", entry.getValue());
			} else {
		  		assertEquals(entry.getValue(), "");
			}
		}
	}
}
