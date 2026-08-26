
import myPakage2.MyClass;
class encapsulation {
   //static int EmpId = 10;     // whem use static then in main method making object instantion is not required
//    int EmpId = 10;
//     int Salary = 20000;
//     int fuckgiven = 10000;

    // void countSalary(){
       //  System.out.println(Salary+fuckgiven);
    // }

    public static void main(String[] args){
        Employee employee = new Employee();      // class name     object namme( hold memory)             new- memory allocation
       // employee.countSalary();
        MyClass myclass = new MyClass();
       myclass.greet();
       System.out.println(employee.getPh());
}

}