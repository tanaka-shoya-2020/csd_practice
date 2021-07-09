import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpellOutTest {

    @Test
    public void SpellOut() {
        SpellOut a = new SpellOut();
        Map<Integer,String> map = new HashMap<>()
        {{
            put(9, "nine" );
            put(99, "ninety nine" );
            put(300, "three hundred");
            put(310, "three hundred and ten");
            put(1501, "one thousand, five hundred and one");
            put(512607, "five hundred and twelve thousand, six hundred and seven");
            put(43112603, "forty three million, one hundred and twelve thousand, six hundred and three");
        }};
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            assertEquals(entry.getValue(), a.convert(entry.getKey()));
        }
    }
}
