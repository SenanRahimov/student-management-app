package LamdaTask;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTask1 {
    public static void main(String[] args) {
        List<String>name =new ArrayList<>();
        name.add("kenan");
        name.add("fuad");
        name.add("leo");
        name.add("yamal");
        name.add("cubarsi");
        name.add("kunde");
        name.add("balde");
      Consumer<String>consumer= s -> System.out.println(s.toUpperCase());
      name.forEach(consumer);
       //name.forEach(s -> System.out.println(s.toUpperCase()));
        }

    }


