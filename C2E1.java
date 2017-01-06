import java.util.*;

public class C2E1{


    public static void main(String[] args){
        Node head = new Node(1);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(1);
        head.appendToTail(2);
        head.appendToTail(4);
        head.appendToTail(3);

        clearWithBuffer(head);
        head.printList();

        head = new Node(1);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(1);
        head.appendToTail(2);
        head.appendToTail(4);
        head.appendToTail(3);

        clearNoBuffer(head);
        head.printList();

        /*LinkedList<Object> ll = new LinkedList<Object>();
          ll.add(1);
          ll.add(2);
          ll.add(3);
          ll.add(1);
          ll.add(2);
          ll.add(3);
          clearWithBuffer(ll);
          for(Object o : ll){
          System.out.println(o);
          }

          ll = new LinkedList<Object>();
          ll.add(1);
          ll.add(2);
          ll.add(3);
          ll.add(1);
          ll.add(2);
          ll.add(3);
          clearNoBuffer(ll);
          for(Object o : ll){
          System.out.println(o);
          }*/



    }

    public static void clearWithBuffer(Node n){
        HashMap<Object, Integer> map = new HashMap<Object, Integer>();
        Node previous = null;
        while(n!=null){
            if(map.containsKey(n.data)){
                //System.out.println("REMOVE: " + n.data);
                previous.next=n.next;
                n=previous.next;
            }
            else{
                map.put(n.data,1);
                previous=n;
                n=n.next;
            }
            
        }
    }

    public static void clearNoBuffer(Node n){
        Node previous2;
        Node runner;
        while(n!=null){
            previous2=n;
            runner=n.next;
            while(runner!=null){
                if(n.data==runner.data){
                    if(runner.next!=null){
                        runner.data=runner.next.data;
                        runner.next=runner.next.next;
                    }
                    else{
                        previous2.next=null;
                        break;
                    }

                }
                else{
                    previous2=previous2.next;
                    runner=previous2.next;
                }
            }
            n=n.next;
        }
    }
    /*public static void clearWithBuffer(LinkedList list){
      HashMap<Object, Integer> map = new HashMap<Object, Integer>();
      for(int i=0; i<list.size(); i++){
      Object o = list.get(i);
      if(map.containsKey(o)){
      list.remove(i);
      i--;
      }
      else{
      map.put(o, 1);
      }
      }
      }*/

    /*public static void clearNoBuffer(LinkedList list){
      for(int i=0; i<list.size(); i++){
      for(int j=i+1; j<list.size(); j++){
      if(list.get(i).equals(list.get(j))){
      list.remove(j);
      j--;
      }
      }
      }
      }*/
    }







