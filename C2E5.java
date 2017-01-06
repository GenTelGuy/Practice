import java.util.*;
public class C2E5{
    
    public static void main(String[] args){
        Node head = new Node(1);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(4);
        head.appendToTail(5);

        head.next.next.next.next.next=head.next.next;
        System.out.println(findLoop(head).data);
        
    }

    public static Node findLoop(Node n){
        HashMap<Object, Integer> map = new HashMap<Object, Integer>();
        while(!map.containsKey(n)){
            map.put(n,1);
            n=n.next;
        }
        return n;
    }
}
