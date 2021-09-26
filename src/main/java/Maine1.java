import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Maine1 {

    public static void main(String[] args) {
        List<? extends Number> list = new ArrayList<>();
        Date date = new Date();
        Object o = new Object();
        System.out.println(o.hashCode());
        Person person = new Person("dffsd", 4, date);
        Person person2 = new Person("dffsd1", 4, date);
        System.out.println(person.hashCode());

////        list.add(7L);
//        list.add(Integer.valueOf(9));
//        list.add(9);
//        for (Object item : list) {
//            System.out.println(item.getClass());
//            System.out.println("Теккущий элемент: " + item);
//        }
    }
}



