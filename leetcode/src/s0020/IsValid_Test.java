package s0020;

import org.junit.Test;

/**
 * @author KK
 * @create 2021/11/16 20:26
 */
public class IsValid_Test {
    @Test
    public void test() {
        System.out.println(IsValid.isValid("()[]{}") == true);
        System.out.println(IsValid.isValid("(]") == false);
        System.out.println(IsValid.isValid("({[]})") == true);
        System.out.println(IsValid.isValid("(){[({[]})]}") == true);
        System.out.println(IsValid.isValid("((([[[{{{") == false);
        System.out.println(IsValid.isValid("(())]]") == false);
        System.out.println(IsValid.isValid("") == true);
        System.out.println(IsValid.isValid("[") == false);
    }
}
