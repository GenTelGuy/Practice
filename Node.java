

public class Node{
    public Node next = null;
    public int data;
    public Node(int d){data=d;}
    void appendToTail(int d){
        Node end = new Node(d);
        Node n = this;
        while(n.next != null){n=n.next;}
        n.next=end;
    }
    void printList(){
        System.out.println(this.data);
        if(this.next!=null){
            this.next.printList();
        }
    }
    Node deleteNode(int d){
        if(this.data == d){
            return this.next;
        }
        else if(this.next!=null){
            this.next.deleteNode(d);
            return this;
        }
        else{
            return this;
        }
    }


}

