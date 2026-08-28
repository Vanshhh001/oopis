//here work() define what must be done without specifing howon it should be done

public abstract class abstractEmp {

    int id;
    String name;

    // Constr
    // abstractEmp(int id, String name) {
    //     this.id = id;
    //     this.name = name;
    // }

    // Abstract method
    abstract void work();
    

    void display() {
        System.out.println( id);
        System.out.println( name);
   }
}


// Child class
class Developer extends abstractEmp {
    
    // Developer(int id, String name) {
    //     super(id, name);
    // }

    // Providee implementation of abstract method
    @Override
    void work() {
        System.out.println(name + " is writing code.");
    }
}


// Another child class
class Manager extends abstractEmp {

    // Manager(int id, String name) {
    //     super(id, name);    // used to call construcot from parent class
    // }

    // Providing implementation of abstract method
    void work() {
        System.out.println(name);
    }

    public static void main(String[] args) {

        Developer d = new Developer();

        d.display();
       System.out.println(d.id);
        d.work();

        System.out.println();

        Manager m = new Manager();

        m.display();
       System.out.println(m.name);
        m.work();
    }

 
}
