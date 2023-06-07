public class ClassLevelScope {
    // When a variable is declared inside a class and outside the methods, then
    // varibale is called as class level scope.
    int rollNo = 1; // class level scope
    String name = "Simbaa"; // class level scope

    // This variables can be accessible everywhere in the class including in every
    // methods also.

    public static void run() {
        System.out.println("Name is " + name + " and Roll number is" + rollNo);
    }

    public static void main(String[] args) {
        run();
    }
}
