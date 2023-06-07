public class Loops {
    public static void main(String[] args) {
        // While loops
        // While loops are used to repeat a block of code as long as a condition is
        // true.
        int num = 5;
        // Find factorial
        int fact = 1;
        while (num > 0) {
            fact = fact * num;
            num--;
        }
        System.out.println(fact);
    }
}
