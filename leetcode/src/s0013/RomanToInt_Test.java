package s0013;

import org.junit.Test;

public class RomanToInt_Test {
    @Test
    public void test() {
        System.out.println(RomanToInt.romanToInt("III") == 3);
        System.out.println(RomanToInt.romanToInt("VI") == 6);
        System.out.println(RomanToInt.romanToInt("IX") == 9);
        System.out.println(RomanToInt.romanToInt("LVIII") == 58);
        System.out.println(RomanToInt.romanToInt("MCMXCIV") == 1994);
    }
}
