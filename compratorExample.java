import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class compratorExample {
    public static void main(String[] args) {
        ArrayList arrayList= new ArrayList<>();
        arrayList.add("mango");
        arrayList.add("banana");
        arrayList.add("orange");
        arrayList.add("apple");
        System.out.println(" As per added element without performing any operation " + arrayList);
        arrayList.sort(new myComprator());
        System.out.println(arrayList);
        List<Integer>  value = Arrays.asList(10, 55, 99, 33, 77, 11, 22, 33);
        value.sort(new assendingComprator());
        System.out.println("Calling ascendingComparator "+value);

        value.sort(new desendingComprator());
        System.out.println("this is converting in to descending "+value);
    }


}
class myComprator implements Comparator<String> {



    @Override
    public int compare(String s1, String s2) {
        return s2.length()-s1.length();
    }
}
class assendingComprator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1-o2;
    }
}
class desendingComprator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}
