public abstract class abstractEmp {

    // Data
    int id;
    String name;

    // Constructor
    abstractEmp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Abstract method
    abstract void work();

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
   }
}


// Child class
class Developer extends abstractEmp {
    
    Developer(int id, String name) {
        super(id, name);
    }

    // Providee implementation of abstract method
    @Override
    void work() {
        System.out.println(name + " is writing code.");
    }
}


// Another child class
class Manager extends abstractEmp {

    Manager(int id, String name) {
        super(id, name);
    }

    // Providing implementation of abstract method
    void work() {
        System.out.println(name + " is managing the team.");
    }

    public static void main(String[] args) {

        Developer d = new Developer(101, "Vansh");

        d.display();
       System.out.println(d.id);
        d.work();

        System.out.println();

        Manager m = new Manager(102, "Tusharr");

        m.display();
       System.out.println(m.name);
        m.work();
    }

 
}
