

public class Employee {
    private int EmpId = 10;
    private int ph = 1921212;
    private String name;
    private String massage;
    private int Sal = 10000;
    private int bonus = 1000;
    private void print(){
        System.out.println(Sal+bonus);
    }
    //getter and setter for encap
    // getter
    public int getPh(){
        return ph;
    }
   public String getName(){
        return name;
    }
}
