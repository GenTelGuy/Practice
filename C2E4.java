public class C2E4{
    public static void main(String[] args){
        Node head1 = new Node(3);
        head1.appendToTail(3);
        head1.appendToTail(5);

        Node head2 = new Node(5);
        head2.appendToTail(9);
        head2.appendToTail(4);
        head2.appendToTail(1);
        head2.appendToTail(6);

        add(head1, head2).printList();
    }

    public static Node add(Node list1, Node list2){
        if(list1==null&&list2==null){return null;}
        Node head = new Node(-1);
        int carry=0;
        while(!(list1==null&&list2==null)){
            int term1=0;
            int term2=0;
            if(list1!=null){
                term1=list1.data;
            }
            if(list2!=null){
                term2=list2.data;
            }
            int sum=term1+term2+carry;
            carry=0;
            if(sum>=10){
                carry=1;
                sum-=10;
            }
            head.appendToTail(sum);
            if(list1!=null){
                list1=list1.next;
            }
            if(list2!=null){
                list2=list2.next;
            }
        }
        if(carry==1){
            head.appendToTail(1);
        }
        return head.next;
    }
}
