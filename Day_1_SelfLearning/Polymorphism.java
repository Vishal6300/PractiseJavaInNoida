public class Polymorphism {
    /*
     * Polymorphism is the process in which we can use same resourse in multiple
     * forms.
     * It means we can use same method name or constructor name multiple times with
     * different different signatures.
     * 
     * 
     */
    private String name;
    private int rollNo;

    // This is the example of constructor overloading
    public Polymorphism(String name) {
        this.name = name;
    }

    public Polymorphism(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // This is the example of method overloading
    public void student(String name) {
        System.out.println(name);
    }

    public void student(int rollNo) {
        System.out.println(rollNo);
    }

    public void student(String name, int rollNo) {
        System.out.println(name + " " + rollNo);
    }

    public static void main(String[] args) {
        Polymorphism p = new Polymorphism();
        p.student("HeroHeralal", 2);
        p.student("HeroHeralal");
    }
}
