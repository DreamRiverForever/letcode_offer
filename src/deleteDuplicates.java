public class deleteDuplicates {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    //递归
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        head.next = deleteDuplicates(head.next);
        if(head.val == head.next.val) head = head.next;
        return head;
    }
    //双指针
    public ListNode deleteDuplicates2(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode node1=head;
        ListNode node2=head.next;
        while(node2!=null){
            if(node1.val==node2.val){
                node2=node2.next;
                node1.next=node2;
            }
            else{
                node1=node1.next;
                node2=node2.next;
            }

        }
        return head;


    }
}
