package top.kukuli;

import com.kukuli.test.Customer;

import java.util.Arrays;

/**
 * @Author: Aaron.Li
 * @Date: 2021 - 12 - 25 -21:15
 * @Project: IDEA_Workspace
 * @Version: JDK17.0.1
 */
public class Test25_CustomerTest {
    public static <arr> void main(String[] args) {
        Customer cust1 = new Customer();
        int[] arr = new int[]{1, 3, 5, 7, 54, 432, 534, 8586};
        int key = 54;
        int arr1 = cust1.hell(arr, key);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr1);
        cust1.sleep(8);
    }
}

