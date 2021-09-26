import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GenericUsage2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add(new Person("Vasya", 30, new Date()));

        System.out.println(list.size());
    }
}
