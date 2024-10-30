package Task;

public class AdvancedCalculator extends Calculator{
    public   int add (int a, int b) {
        System.out.println("Using AdvancedCalculator for integer addition.");
        return super.add(a,b);
    }


}
