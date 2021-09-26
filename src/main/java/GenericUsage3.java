import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GenericUsage3 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Fedya");
        list.add("Vasilisa");
        list.add("Alex");
        list.add(new Person("Vasya", 30, new Date()));

        for (Object o: list){
            String item = (String) o;
            System.out.println(item);
        }
    }
}
