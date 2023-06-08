public class BlockLevelScope {
    public static void main(String[] args) {
        // When a variable is declared under any block or loop, it's scope will be block
        // level or it is also called as local variable.
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // Here i is a local variable that has block level scope. It will not accessible
        // outside the loop.
        
    }
}
