import java.util.Arrays;
import java.util.LinkedList;

public class linkedListExample2 {
    public static void main(String[] args) {
        LinkedList linkedList= new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.addLast(5);
        linkedList.addFirst(0);
        System.out.println(linkedList);
        LinkedList animal= new LinkedList(Arrays.asList("cow","fox","Dog","Lion"));
        LinkedList removeAnimal= new LinkedList<>(Arrays.asList("cow","fox"));
        animal.removeAll(removeAnimal);
        System.out.println(animal);

    }
}
