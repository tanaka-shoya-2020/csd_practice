import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PorkerTest {

    @Test
    public void Porker() {
        Porker a = new Porker();
        Map<String,String> map = new HashMap<>()
        {{
            put("2C 3H 4S 8C AH","high card: Ace");
            put("2H 4S 4C 2D 4H","full house");
            put("2H 3D 5S 9C KD","high card: 9");
        }};
        for(Map.Entry<String, String> entry : map.entrySet()){
            assertEquals(entry.getValue(), a.showDown(entry.getKey()));
        }
    }
}
