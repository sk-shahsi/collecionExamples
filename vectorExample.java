import java.util.Vector;

public class vectorExample {
    public static void main(String[] args) {
        //Vector<Integer> vector=new Vector<>();
        Vector<Integer> vector=new Vector<>(10,15);
        System.out.println("printing default size "+vector.size());
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        System.out.println("printing after adding elements size "+vector.size());
        System.out.println("printing vector "+vector);
        System.out.println("printing vector capacity "+vector.capacity());
        vector.add(6);
        vector.add(7);
        vector.add(8);
        vector.add(9);
        vector.add(10);
        vector.add(11);

        System.out.println("printing after adding elements size "+vector.size());
       // System.out.println("printing vector "+vector);
        //now capacity increased by default value of double mens 20, now we can controll over capacity
        System.out.println("printing vector capacity Now it increased by double as 20  "+vector.capacity());

    }
}
