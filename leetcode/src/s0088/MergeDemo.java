package s0088;

import org.junit.Test;

import java.util.Arrays;

public class MergeDemo {

	@Test
	public void testMerge(){
        int[] arr1 = {5,8,21,0,0,0,0};
        int[] arr2 = {1,2,13,17};
        Solution.merge(arr1,3,arr2,4);
        System.out.println(Arrays.equals(new int[]{1,2,5,8,13,17,21},arr1));

        int[] arr3 = {2,6,7,8,0,0,0,0};
        int[] arr4 = {1,2,5,7,};
        Solution.merge(arr3,4,arr4,4);
        System.out.println( Arrays.equals(new int[]{1,2,2,5,6,7,7,8}, arr3));

        int[] arr5 = {11,18,21,0,0,0,0};
        int[] arr6 = {45,56,56,57};
        Solution.merge(arr5,3,arr6,4);
        System.out.println(Arrays.equals(new int[]{11,18,21,45,56,56,57}, arr5));
	}

}