package LinkedList;

public class FindMiddleElement {
    private static ListNode head;
    private static class ListNode{
        int data;
        ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }

    private static ListNode findMiddle(){
        ListNode slw =head;
        ListNode fst =head;
        while(fst!=null && fst.next!=null){
            slw=slw.next;
            fst=fst.next.next;
        }
        return slw;
    }



    public static void main(String[] args) {
        head=new ListNode(10);
        ListNode second =new ListNode(20);
        ListNode third =new ListNode(30);
        ListNode fourth =new ListNode(40);

        head.next=second;
        second.next=third;
        third.next=fourth;

        System.out.println(findMiddle().data);
    }
}
