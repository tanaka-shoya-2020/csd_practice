import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Porker {

    public List<String> sort(List<String> pokerHand) {
      String card = null;
      int num;
        for (int i = 0; i < pokerHand.size(); i++) {
            card = pokerHand.get(i);
            num = Character.getNumericValue(card.charAt(0));
        }
        return null;
    }

    public String showDown(List<String> pokerHand) {
        // 手札
        List<String> heartHand = new ArrayList<>();
        Collections.addAll(heartHand, "AH", "2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H", "10H",
                "JH", "QH", "KH");

        List<String> spadeHand = new ArrayList<>();
        Collections.addAll(spadeHand, "AS", "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", "10S",
                "JS", "QS", "KS");

        List<String> diamondHand = new ArrayList<>();
        Collections.addAll(diamondHand, "AD", "2D", "3D", "4D", "5D", "6D", "7D", "8D", "9D", "10D",
                "JD", "QD", "KD");

        List<String> clubHand = new ArrayList<>();
        Collections.addAll(clubHand, "AC", "2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C", "10C",
                "JC", "QC", "KC");

        // ポーカーの手札の並べ替え(sortを行う)
        List<String> sotedHand = sort(pokerHand);
        // イメージ "2H 4S 4C 2D 4H" => "2H 2D 4H 4S 4C"

        // ポーカーの手札がストレートフラッシュの時
        // ロイヤルストレートフラッシュである時(種類が一種類、数字が段々になっている)
        // フォーカードである時
        // フルハウスである時
        // フラッシュであった時
        // ストレートであった時
        // スリーカードであった時
        // ツーペアであった時
        // ワンペアであった時
        // ノーハンドであった時


        System.out.println("foobar");
        return "foobar";
    }
}