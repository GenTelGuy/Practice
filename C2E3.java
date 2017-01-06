public class C2E3{
    public static void main(String[] args){
        Node head = new Node(1);
        head.appendToTail(2);
        head.appendToTail(3);
       
        removeNode(head.next);
        head.printList();
    }

    public static void removeNode(Node target){//It's always a middle node
        target.data=target.next.data;
        target.next=target.next.next;
    }
}
