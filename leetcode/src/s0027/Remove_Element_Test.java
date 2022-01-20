package s0027;

import org.junit.Test;

/**
 * @author KK
 * @create 2021/11/16 19:34
 */
public class Remove_Element_Test {

    @Test
    public void test() {
        System.out.println(6 == Remove_Element.remove_element(new int[]{0, -1, 2, 7, 5, 4, 6}, 7));
        System.out.println(2 == Remove_Element.remove_element(new int[]{3, 2, 4}, 5));
        System.out.println(3 == Remove_Element.remove_element(new int[]{3, 2, 4, 6}, 5));
        System.out.println(5 == Remove_Element.remove_element(new int[]{0, 1, 9, 3, 5, 8}, 0));
    }
}
