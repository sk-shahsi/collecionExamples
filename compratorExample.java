import java.util.ArrayList;
import java.util.Comparator;

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
    }


}
class myComprator implements Comparator<String> {



    @Override
    public int compare(String s1, String s2) {
        return s2.length()-s1.length();
    }
}
