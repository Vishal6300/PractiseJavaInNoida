public class methodLevelScope {
    // When a variable is declared inside a method , it is called as the variable
    // has method level scope.
    public void run() {
        int count = 1;
        System.out.println(count);
    }

    // it will not accessible outside this method.

}
