package LinkedList;

public class DeleteLoopElement {
    private static ListNode head;
    private static class ListNode{
        int data;
        ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }

    private static void DeleteLoop(){
        ListNode slw =head;
        ListNode fst =head;
        while(fst!=null && fst.next!=null){
            fst=fst.next.next;
            slw= slw.next;
            if(slw==fst){
                 DeleteLoopEle(slw);
                 return;
            }
        }
    }

    private static void DeleteLoopEle(ListNode slw) {
        ListNode current =head;
        while(current.next!=slw.next){
            current=current.next;
            slw= slw.next;
        }
        slw.next=null;
    }

    private static void disp(){
        ListNode current =head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        head=new ListNode(10);
        ListNode second =new ListNode(20);
        ListNode third =new ListNode(30);
        ListNode fourth =new ListNode(40);
        ListNode fifth =new ListNode(50);
        ListNode sixth =new ListNode(60);

        head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=second;

//        disp();
        DeleteLoop();
        disp();

    }
}
