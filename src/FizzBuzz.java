import java.util.HashMap;
import java.util.Map;

public class FizzBuzz {
    private int number = 100;
    private int i;
    private Map<Integer, String> map = new HashMap<>();
    public Map<Integer, String> sayFizzBuzz() {
        for (i = 1; i <= number; i++) {
            if (i % 15 == 0) {
                map.put(i, "FizzBuzz");
            } else if (i % 3 == 0 || i % 10  == 3) {
                map.put(i, "Fizz");
            } else if (i % 5 == 0) {
                map.put(i, "Buzz");
            } else {
                map.put(i, "");
            }
        }
        return map;
    }
}