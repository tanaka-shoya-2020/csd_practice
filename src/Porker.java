import java.util.*;

public class Porker {

    public Map<Integer,String> changeCardInfo(List<String> pokerHand) {
        String card = null;
        Map<Integer,String> cardInfo = new HashMap<>();
        for (int i = 0; i < pokerHand.size(); i++) {
            card = pokerHand.get(i);
            String cardString = card.substring(0,1);
            switch (cardString) {
                case "A":
                    cardString = "1";
                case "J":
                    cardString = "11";
                case "Q":
                    cardString = "12";
                case "K":
                    cardString = "13";
            }
            int num = Integer.parseInt(cardString);
            cardInfo.put(num, card.substring(1,2));
        }
        return cardInfo;
    }

    public List<Integer> pickUpNumber(Map<Integer,String> cardInfo) {
        List<Integer> pickUpNumber = new ArrayList<>();
        pickUpNumber.addAll(cardInfo.keySet());
        return pickUpNumber;
    }

    public String checkFullHouse(Map<Integer,String> cardInfo) {
        List<Integer> pickUpNumber = pickUpNumber(cardInfo);
        System.out.println(pickUpNumber);
        for (Integer k : pickUpNumber){
            pickUpNumber.get(k);
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

        // カードの情報を変更)
        Map<Integer, String> cardInfo = changeCardInfo(pokerHand);

        // ポーカーの手札がストレートフラッシュの時
        // ロイヤルストレートフラッシュである時(種類が一種類、数字が段々になっている)
        // フォーカードである時
        // フルハウスである時
        String showDown =  checkFullHouse(cardInfo);
        // フラッシュであった時
        // ストレートであった時
        // スリーカードであった時
        // ツーペアであった時
        // ワンペアであった時
        // ノーハンドであった時

        return "showDown";
    }
}