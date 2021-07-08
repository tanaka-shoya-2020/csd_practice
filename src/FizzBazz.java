import java.util.HashMap;
import java.util.Map;

public class FizzBazz {
    private int number = 100;
    private int i;
    private Map<Integer, String> map = new HashMap<>();
    public Map<Integer, String> sayFizzBazz() {
        for (i = 1; i <= number; i++) {
            if (i % 15 == 0) {
                map.put(i, "FizzBazz");
            } else if (i % 3 == 0 || i % 10  == 3) {
                map.put(i, "Fizz");
            } else if (i % 5 == 0) {
                map.put(i, "Bazz");
            } else {
                map.put(i, "");
            }
        }
        return map;
    }
}