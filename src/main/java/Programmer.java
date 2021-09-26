import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
public class Programmer extends Person{
    private String type;

    public Programmer(String name, int age, Date birthday, String type) {
        super(name, age, birthday);
        this.type = type;
    }

}
