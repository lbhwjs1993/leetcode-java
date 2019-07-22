package _12_;

import java.util.HashMap;
import java.util.Map;

public class IntegertoRoman {
    public static void main(String[] args) {
        System.out.println(intToRoman(9));
    }

    public static String intToRoman(int x) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");
        map.put(4, "IV");
        map.put(9, "IX");
        map.put(40, "XL");
        map.put(90, "XC");
        map.put(400, "CD");
        map.put(900, "CM");
        int sum = 0;
        String roman = "";
        while (x > 0) {
            sum = sum * 10 + x % 10;
            x = x / 10;
        }
        while (sum > 0) {
            if (map.containsKey(sum % 10)) {
                roman += map.get(sum % 10);
            }
        }
        return roman;
    }
}
