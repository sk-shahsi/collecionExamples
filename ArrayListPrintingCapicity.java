import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Objects;

public class ArrayListPrintingCapicity {
    public static void main(String[] args) throws Exception{
        ArrayList a=new ArrayList<>(11);
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(1);
        Field f=ArrayList.class.getDeclaredField("elementData");
        f.setAccessible(true);
        Objects[] elementData= (Objects[]) f.get(a);
        System.out.println("ArrayList Capicity: "+elementData.length);
        a.add(2);

        elementData= (Objects[]) f.get(a);
        System.out.println("array list Capicity "+elementData.length);

        a.remove(2);

        elementData= (Objects[]) f.get(a);
        System.out.println("array list Capicity "+elementData.length);

        a.trimToSize();
        elementData= (Objects[]) f.get(a);
        System.out.println("array list Capicity "+elementData.length);

    }
}
