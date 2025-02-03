import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.size();

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(5);
        arrayList.add(1,100);
        System.out.println("using get by index "+arrayList.get(0));
        System.out.println("size "+arrayList.size());
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.println("Fatching data using for loop "+arrayList.get(i));

        }
        for (int i:arrayList){
            System.out.println("using for each loop "+i);
        }
    }
}
