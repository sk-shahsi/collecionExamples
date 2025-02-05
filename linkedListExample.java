public class linkedListExample {
    public static void main(String[] args) {
        Node node1=new Node();
        node1.value=1;

        Node node2=new Node();
        node1.next=node2;
        node2.value=2;
        node2.next=null;



    }
}
class Node{
   public int value;
    public  Node next;
}
