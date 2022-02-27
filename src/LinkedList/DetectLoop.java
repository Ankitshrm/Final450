package LinkedList;

public class DetectLoop {
    private static ListNode head;

    private static class ListNode{
        int data;
        ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }

    private static boolean LoopDetect(){
        if(head==null) return false;
        ListNode slw =head;
        ListNode fst =head;
        while(fst!=null && fst.next!=null){
            fst=fst.next.next;
            slw= slw.next;
            if(slw==fst) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        head=new ListNode(10);
        ListNode second =new ListNode(10);
        ListNode third =new ListNode(30);
        ListNode fourth =new ListNode(30);

        head.next=second;
        second.next=third;
        third.next=second;

        System.out.println(LoopDetect());
    }
}
