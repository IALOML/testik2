import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Maine12 {

    public static void main(String[] args) {
//        List<String> list = new ArrayList();
//        list.add("sdfsd");
//        list.add(String.valueOf(3));
//        list.add("ewtewge");
//        list.add("23");
//
//        Object asdasf = list.get(2);
//        Object dwefwe = list.get(3);
//
//        System.out.println(asdasf + " " + dwefwe);
//        list.add((String) dwefwe);
//        printfoo(list);
        List list = new ArrayList<>();
//        addAll(list);
    }

    public static <T> Object printfoo(Collection<T> collection) {
        for (Iterator<T> iterator = collection.iterator(); iterator.hasNext(); ) {
            T next = iterator.next();
            System.out.println(next);
        }
        return null;
    }

//    public static <T> void addAll(Collection<T> list) {
//        for (int i = 0; i <= 5; i++) {
//
//            list.add("hgjh");
//            list.add(5);
//        }
//
//        list.forEach(o -> System.out.println("# " + o));
//    }
}

