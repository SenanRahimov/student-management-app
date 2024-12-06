package Task14;

public interface Printable {
    default void display() {
        System.out.println("Printing content.");
    }
}
