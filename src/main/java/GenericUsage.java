import java.util.ArrayList;
import java.util.List;

public class GenericUsage {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Ola");
        list.add("Eugen");
        list.add("Vasy");
        for (Object o : list) {
           String item = (String) o;
            System.out.println(item);
        }
    }
}
