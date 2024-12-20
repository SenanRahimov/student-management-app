package LamdaTask;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class SupplierTask {
    public static void main(String[] args) {
        Supplier<LocalDateTime> dateTime = () -> LocalDateTime.now();
        LocalDateTime currentDateTime = dateTime.get();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm (EEEE) - dd MMM yyyy");
        String formattedDateTime = currentDateTime.format(formatter);

        System.out.println(formattedDateTime);

    }
}
