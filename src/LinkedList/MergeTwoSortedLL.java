package LinkedList;

public class MergeTwoSortedLL {
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

    private static ListNode merger(ListNode a, ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail =dummy;
        while(a!=null && b!=null){
            if(a.data<=b.data){
                tail.next=a;
                a=a.next;
            }else{
                tail.next=b;
                b=b.next;
            }
            tail=tail.next;
        }
        if(a==null){
            tail.next=b;
        }else {
            tail.next=a;
        }
        return dummy.next;
    }

    private static void addLast(ListNode val){

        if (head==null){
            head =val;
            return;
        }
        ListNode current = head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=val;
    }



    public static void main(String[] args) {
        MergeTwoSortedLL m1 = new MergeTwoSortedLL();
        m1.addLast(new ListNode(1));
        m1.addLast(new ListNode(3));
        m1.addLast(new ListNode(5));
        m1.addLast(new ListNode(9));
        m1.addLast(new ListNode(45));




        MergeTwoSortedLL m2 = new MergeTwoSortedLL();
        m2.addLast(new ListNode(2));
        m2.addLast(new ListNode(4));
        m2.addLast(new ListNode(6));
        m2.addLast(new ListNode(455));
        m2.addLast(new ListNode(2555));




         m1.head = merger(m1.head,m2.head);

         m1.disp();
    }
}
