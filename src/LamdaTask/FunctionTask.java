package LamdaTask;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionTask {
    //Bir List<String> içərisindəki hər bir sözün uzunluğunu
    // hesablayan bir Function yaradın və
    // bu Function-dan istifadə edərək sözlərin uzunluqlarını
    // yeni bir List-ə doldurun və çap edin

    public static void main(String[] args) {
        List<String>words=new ArrayList<>();
        words.add("phone");
        words.add("notebook");
        words.add("book");
        words.add("chair");
        words.add("table");
        Function<String,Integer>function=(word)->word.length();
        List<Integer> wordLengths = new ArrayList<>();
        for (String word : words) {
            wordLengths.add(function.apply(word));
        }
        System.out.println(wordLengths);
    }

}
