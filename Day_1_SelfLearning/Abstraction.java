abstract class Abstraction {
    // Abstraction is the process in which we hide the implementation details and we
    // only show that part that is needed.
    // When we use abstract class then we can achieve 0 to 100% abstraction beacuse
    // in abstract class there are abstract method and non-abstract method also. If
    // we use interface then we can achieve 100% abstraction beacuse it contains
    // only abstract methods.

    abstract public void addStudent();

    public void viewStudent(String name) {
        System.out.println(name);
    }

    abstract public void updateStudent();

    public String searchRollNo(int rollNo) {
        return name;
    }

}
