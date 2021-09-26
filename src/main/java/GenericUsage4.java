import java.util.*;

public class GenericUsage4 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList();
        list.add(new Person("Borya", 23, new Date()));
        list.add(new Programmer("Vas", 34, new Date(), "hjjhhj"));
//        List<Programmer> list = new ArrayList();
//        list.add(new Programmer("Borya", 23, new Date()));
//        list.add(new Programmer("Vas", 34, new Date()));

        Programmer programmer = new Programmer("Vasya", 37, new Date(), "hgjh");
//        printRsl(list);
        pintPers(list);

        List<Integer> list1 = Arrays.asList(2, 5, 6, 7, 8, 9);
        printRsl(list1);

    }

    public static void printRsl(Collection<?> collection) {
        for (Iterator<?> iterator = collection.iterator(); iterator.hasNext(); ) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }

    public static void pintPers(Collection<? extends Person> personCollection) {
        for (Iterator<? extends Person> iterator = personCollection.iterator(); iterator.hasNext(); ) {
            Person person = iterator.next();
            System.out.println(person);
        }
    }
}
