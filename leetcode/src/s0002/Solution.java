package s0002;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1,ListNode l2) {
		return null;

    }
}
/**
 * 下面不用管
 * @author HP
 *
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    
    public boolean equals(String test) {
        return this.toString().equals(test);
    }

    public String toString() {
        String temp;
        String last="";
        ListNode now=this;
        while(now !=null){
            temp=Integer.toString(now.val);
            now=now.next;
            last+=temp;
        }
        return last;
    }
}
