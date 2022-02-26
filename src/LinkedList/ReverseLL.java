package LinkedList;

public class ReverseLL {

    private static ListNode head;

    private static class ListNode{
        int data;
        ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }

    private static void disp(ListNode head){
        ListNode current =head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }

    private static void disp(){
        ListNode current =head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }

    private static void reverseIterativeFun(){

        ListNode prev=head;
        ListNode current=head.next;
        while(current!=null){
            ListNode next = current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head.next=null;
        head=prev;
    }

    private static ListNode recursiveReverse(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode newHead = recursiveReverse(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }

    private static ListNode reverseIterative(){
        ListNode current =head;
        ListNode prev =null;
        ListNode next =null;
        while(current!=null){
            next=current.next;
            current.next =prev;
            prev=current;
            current=next;
        }
        return prev;
    }

    public static void main(String[] args) {
        head=new ListNode(10);
        ListNode second =new ListNode(20);
        ListNode third =new ListNode(30);
        ListNode fourth =new ListNode(40);

        head.next=second;
        second.next=third;
        third.next=fourth;


        reverseIterativeFun();
        disp();

        ListNode newhead=recursiveReverse(head);
        disp(newhead);


        ListNode headNode =reverseIterative();
        disp(headNode);






    }
}
