import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SpellOut {
    private Map<Integer, String> onesPlace = new HashMap<>()
    {{
        put(1, "one" );
        put(2, "two" );
        put(3, "three" );
        put(4, "four" );
        put(5, "five" );
        put(6, "six" );
        put(7, "seven" );
        put(8, "eight" );
        put(9, "nine" );
    }};

    private Map<Integer, String> tensPlace = new HashMap<>()
    {{
        put(10, "ten" );
        put(20, "twenty" );
        put(3, "thirty" );
        put(4, "forty" );
        put(5, "fifty" );
        put(6, "sixty" );
        put(7, "seventy" );
        put(8, "eighty" );
        put(9, "ninety" );
    }};

    private Map<Integer, String>  theenth = new HashMap<>()
    {{
        put(11, "eleven" );
        put(12, "twelve" );
        put(13, "thirteen" );
        put(14, "fourteen" );
        put(15, "fifteen" );
        put(16, "sixteen" );
        put(17, "seventeen" );
        put(18, "eighteen" );
        put(19, "nineteen" );
    }};

    public String convert(int number) {
        String x = null;
        int mod = 0;
        int a = 0;
        int denom = 0;
        int div = 0;

        TreeMap<Integer, String> unit = new TreeMap<>()
        {{
            put((int) Math.pow(10,3), "thousand");
            put((int) Math.pow(10,6), "million");
            put((int) Math.pow(10,9), "billion");
        }};

        for (int i = 1; i <= unit.size(); i++) {
            if (unit.lastKey() < number){
            } else if (number < 1000) {
                break;
            } else {
                denom = unit.lastKey() / 1000;
                if (number < denom) {
                    unit.remove(unit.lastKey());
                    continue;
                }
                div = number / denom;
            }
            if (div < 10) {
                if (x == null) {
                    x = onesPlace.get(div) + " " + unit.get(denom) + ",";
                } else {
                    x = x + " " + onesPlace.get(div) + " " + unit.get(denom) + ",";
                }
            } else if (div < 20) {
                if (x == null) {
                    x = theenth.get(div) + " " + unit.get(denom) + ",";
                } else {
                    x = x + " " + theenth.get(div) + " " + unit.get(denom) + ",";
                }
            } else if (div < 100) {
                int num = div / 10;
                mod = div % 10;
                if (x == null) {
                    x = tensPlace.get(num) + " " + onesPlace.get(mod) + " " + unit.get(denom) + ",";
                } else {
                    x = x + " " + tensPlace.get(num) + " " + onesPlace.get(mod) + " " + unit.get(denom) + ",";
                }
            } else {
                int num = div / 100;
                mod = div % 100;
                if (x == null) {
                    x = onesPlace.get(num) + " " + "hundred" + " and "+ tensPlace.getOrDefault(mod, "") + theenth.getOrDefault(mod, "") + onesPlace.getOrDefault(mod, "") + " " + unit.get(denom) + ",";
                } else {
                    if (10 < mod && mod < 20) {
                        x = x + " " + onesPlace.get(num) + " " + "hundred" + " and "+ theenth.get(mod) + " " + unit.get(denom) + ",";
                    } else {
                        x = x + " " + onesPlace.get(num) + " " + "hundred" + " "+ tensPlace.get(num) + " " + onesPlace.get(mod) + " " + unit.get(denom) + ",";
                    }
                }
            }
            unit.remove(unit.lastKey());
            number = number - denom * div;
        }

        if (number < 10) {
            if (x == null) {
                x = onesPlace.get(number);
            } else {
                x = x + " " + onesPlace.get(number);
            }
        } else if (number < 20) {
            if (x == null) {
                x = theenth.get(number);
            } else {
                x = x + " " + theenth.get(number);;
            }
        } else if (number < 100) {
            int num = number / 10;
            System.out.println(num);
            a = number % 10;
            if (a == 0) {
                if (x == null) {
                    x = tensPlace.getOrDefault(num, "");
                } else {
                    x = x + " " + tensPlace.getOrDefault(num, "");
                }
            } else {
                if (x == null) {
                    x = tensPlace.get(num) + " " + onesPlace.get(a);
                } else {
                    x = x + " " + tensPlace.get(num) + " " + onesPlace.get(a);
                }
            }
        } else {
            int num = number / 100;
            int b = number % 100;
            if (b == 0) {
                if (x == null) {
                    x = onesPlace.get(num) + " " + "hundred";
                } else {
                    x = x + " " + onesPlace.get(num) + " " + "hundred";
                }
            } else {
                a = b / 10;
                int c = b % 10;
                if (c == 0) {
                    if (x == null) {
                        x = onesPlace.get(num) + " " + "hundred" + " and " + tensPlace.get(a * 10);
                    } else {
                        x = x + " " + onesPlace.get(num) + " " + "hundred" + " and " + tensPlace.get(a * 10);
                    }
                } else {
                    if (x == null) {
                        x = onesPlace.get(num) + " " + "hundred" + " and " + tensPlace.get(a * 10);
                    } else {
                        x = x + " " + onesPlace.get(num) + " " + "hundred" + " and" + tensPlace.getOrDefault(a, "") + " " + onesPlace.get(c);
                    }
                }
            }
        }
        return x;
    }
}