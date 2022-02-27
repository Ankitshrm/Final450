package LinkedList;

public class RemoveDuplicateSorted {
    private static ListNode head;
    private static class ListNode{
        int data;
        ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }

    private static void disp(){
        ListNode current =head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }

    private static void DeleteDuplicate(){
        ListNode current = head;
        while(current!=null && current.next!=null){
            if(current.data== current.next.data){
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }
        }
    }

    public static void main(String[] args) {
        head=new ListNode(10);
        ListNode second =new ListNode(10);
        ListNode third =new ListNode(30);
        ListNode fourth =new ListNode(30);

        head.next=second;
        second.next=third;
        third.next=fourth;

        disp();
        DeleteDuplicate();
        disp();
    }
}
