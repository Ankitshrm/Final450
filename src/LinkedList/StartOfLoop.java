package LinkedList;

public class StartOfLoop {
    private static ListNode head;
    private static class ListNode{
        int data;
        ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }

    private static ListNode StartLoopNode(){
        ListNode slw =head;
        ListNode fst =head;
        while(fst!=null && fst.next!=null){
            fst=fst.next.next;
            slw= slw.next;
            if(fst==slw){
                return getStartingLoopElement(slw);
            }
        }
        return head;
    }

    private static ListNode getStartingLoopElement(ListNode slw) {
        ListNode current = head;
        while(current!=slw){
            current=current.next;
            slw=slw.next;
            if(slw==current) return current;
        }
        return null;
    }

    public static void main(String[] args) {
        head=new ListNode(10);
        ListNode second =new ListNode(20);
        ListNode third =new ListNode(30);
        ListNode fourth =new ListNode(40);

        head.next=second;
        second.next=third;
        third.next=second;

        System.out.println(StartLoopNode().data);
    }
}
