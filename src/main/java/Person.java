import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Person {
    private  String name;
    private int age;
    private Date birthday;

    {

        System.out.println("blok Pers");

    }
    static {
        System.out.println("static Pers");
    }

//    public Person(String name, int age, Date birthday) {
//        this.name = name;
//        this.age = age;
//        this.birthday = birthday;
//    }

    public Person() {
//        System.out.println(name);

        System.out.println("Constr Pers");
    }

    public static void main(String[] args) {
        Person person = new Pr();
    }
}

class Pr extends Person {
    {
        System.out.println("blokPr1111");
    }

    static {
        System.out.println("staticPr");
    }

    public Pr(){
        super();
        System.out.println("constr Pr");
    }

}
