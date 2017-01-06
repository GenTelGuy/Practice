public class C2E2{

    public static void main(String[] args){
 
        Node head = new Node(1);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(4);
        head.appendToTail(5);
        head.appendToTail(6);
        head.appendToTail(7);
   
        System.out.println(xToLast(head, 1).data);
        System.out.println(xToLast(head, 2).data);
        System.out.println(xToLast(head, 3).data);
        System.out.println(xToLast(head, 4).data);
        System.out.println(xToLast(head, 5).data);
        System.out.println(xToLast(head, 6).data);
        System.out.println(xToLast(head, 7).data);
        System.out.println(xToLast(head, 8)==null);
    }

    public static Node xToLast(Node n, int x){//N passed in is the head
        Node lagging = n;
        if(n==null){return null;}
        for(int i=0; i<x-1; i++){
            if(n.next==null){return null;}
            else{
                n=n.next;
            }
        }
        
        while(n.next!=null){
            n=n.next;
            lagging=lagging.next;
        }
        return lagging;
    }


}
