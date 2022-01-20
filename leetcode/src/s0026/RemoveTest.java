package s0026;

import org.junit.Test;

public class RemoveTest {
        @Test
public void Test() {

        int[] arr1 = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,6,6,6,7,7,8};
        System.out.println(new Integer(8).equals(Solution.function(arr1)));

        int[] arr2 = {1,1,1,2,2,3,3,4,4,5,5,5,6,6,6,7,7,7,8,9,9};
        System.out.println(new Integer(9).equals(Solution.function(arr2)));

        int[] arr3 = {1,3,7,23,45,65,67,345,673,743,875,954,1024};
        System.out.println(new Integer(13).equals(Solution.function(arr3)));
    }



}
