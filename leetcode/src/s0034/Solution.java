package s0034;

public class Solution {

    /**
     * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。
     * 找出给定目标值在数组中的开始位置和结束位置。
     * 如果数组中不存在目标值 target，返回 [-1, -1]。
     *
     * @param nums 给定数组
     * @param target 目标值
     * @return 返回位置数组
     */
    public int[] searchRange(int[] nums, int target) {
        int a= nums.length;
        int x=0;
        int[] arr;
        arr = new int[]{};
        String details = "["+"]";
        for (int i = 0; i < a; i++) {
            if(nums[i]==target){
                for(int value = 0;value<=9;i++) {
                    arr[value]=i;
                    System.out.print("["+"arr[value]"+"arr[value]"+"]");
                }
                x++;
            }
        }
        if(x==0){
            System.out.println("["+"-1"+","+"-1"+"]");
            return null;
        }
        return null;
    }
}