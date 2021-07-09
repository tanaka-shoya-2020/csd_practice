import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PorkerTest {

    @Test
    public void Porker() {
        Porker a = new Porker();
//        List<String> case1 = new ArrayList<>();
//        Collections.addAll(case1,"2C", "3H", "4S", "8C", "AH" );

//        List<String> case2 = new ArrayList<>();
//        Collections.addAll(case2,"2H", "4S", "4C", "2D", "4H" );

        List<String> case3 = new ArrayList<>();
        Collections.addAll(case3,"2H", "3D", "5S", "9C", "KD" );

        Map<List<String>,String> map = new HashMap<>()
        {{
//            put(case1,"high card: Ace");
//            put(case2,"full house");
            put(case3,"high card: 9");
        }};
        for(Map.Entry<List<String>, String> entry : map.entrySet()){
            assertEquals(entry.getValue(), a.showDown(entry.getKey()));
        }
    }
}
