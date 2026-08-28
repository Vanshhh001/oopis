//hybrid with multilevel and hirchecal(using interface)
class Employeeehyb {
void emp(){
    System.out.println("Emp worls");
}

interface working{
    void work();
}
static class Dev extends Employeeehyb implements working{

public void work(){
    System.out.println("dev work");
}
}
//sen inherit dev
static class senier extends Dev{
     void sinaae(){
        System.out.println("senior woek");
    }
}

static class Manager extends Employeeehyb implements working{
    
    public void work(){
        System.out.println("give task");
    }
}
public static void main(String[] args) {
    System.out.println("Softeaew Dev");
    senier d = new senier();
    d.emp();
    d.work();
    d.sinaae();
   Manager m = new Manager();
   m.work();
}

}
