// package Day_1_SelfLearning;
public class Constant {

    public static void main(String[] args) {
        /*
         * Constant is a variable that is known as final in java. It is used to constant
         * the value/properties
         * of a variable/method/class. Once a final variable is initialized then we can
         * not change
         * the value of it.
         * 
         */
        int a = 10;
        final int b = 20;

        int sum = a + b;
        System.out.println(sum);

        // If we change the value of final variable then it will give error that final
        // variable cannot be re-initialized.

        // b=30;
        // System.out.println(b);

    }
}