import org.junit.jupiter.api.Test;

import java.util.Map;

public class FizzBazzTest {

	@Test
	public void FizzBazz() {
		fizzBazz = new FizzBazz();
		for(Map.Entry<Integer, String> entry : fizzBazz.entrySet()) {
		  if (entry.getKey() % 15 == 0) {
				assertThat(entry.getValue(), is("FizzBazz"));
			} else if (entry.getKey() % 3 == 0 || entry.getKey() % 10 % 3 == 0) {
				assertThat(entry.getValue(), is("Fizz"));
			} else if (entry.getKey() % 5 == 0) {
			  	assertThat(entry.getValue(), is("Bazz"));
			} else {
		  		assertThat(entry.getValue(), is(""));
			}
		}
	}
}
