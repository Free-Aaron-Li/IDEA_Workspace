package s0075;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortTest {
@Test
    public void Test(){

        int[] arr1 = {1,2,1,1,0,2,};
        Solution.function(arr1);
        System.out.println(Arrays.equals(new int[]{0,1,1,1,2,2},arr1));
        int[] arr2 = {1,2,0,0,1,1};
        Solution.function(arr2);
        System.out.println(Arrays.equals(new int[]{0,0,1,1,1,2},arr2));

        int[] arr3 = {0,0,1,2,2};
        Solution.function(arr3);
        System.out.println(Arrays.equals(new int[]{0,0,1,2,2},arr3));
        
    }


}
