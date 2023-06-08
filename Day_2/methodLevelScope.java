public class methodLevelScope {
    // When a variable is declared inside a method , it is called as the variable
    // has method level scope.
    public void run() {
        int count = 1;
        System.out.println(count);
    }

    // it will not accessible outside this method.
    public int check() {
        // it will give compile time error because count variable is not accessible in
        // different method beacuse it has method level scope.
        return count;
    }

}
