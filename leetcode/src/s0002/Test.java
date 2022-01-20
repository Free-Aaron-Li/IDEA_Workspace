package s0002;

public class Test {
    public void test(){
        //l1 = [2,4,3], l2 = [5,6,4]
        ListNode l1=new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,
                new ListNode(9,new ListNode(9,new ListNode(9,null)))))));
        ListNode l2=new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,null))));
        ListNode b=new ListNode(8,new ListNode(9,new ListNode(9,new ListNode(9,
               new ListNode(0,new ListNode(0,new ListNode(0,new ListNode(1,null))))))));
        System.out.println(b.toString().equals(new Solution().addTwoNumbers(l1,l2).toString()));
        ListNode x=new ListNode(2,new ListNode(4,new ListNode(3,null)));
        ListNode y=new ListNode(5,new ListNode(6,new ListNode(4,null)));
        ListNode a=new ListNode(7,new ListNode(0,new ListNode(8,null)));
        System.out.println(a.toString().equals(new Solution().addTwoNumbers(x,y).toString()));
    }
}
