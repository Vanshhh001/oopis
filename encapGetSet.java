import java.util.Scanner;


    public class encapGetSet{
        private int id;
        private  int Ph;
        private String name;
         
        public encapGetSet(int id,int Ph,String name){
            this.id = id;
            this.Ph = Ph;
            this.name = name;
        }
        //getter
        public int getPh(){
            return Ph;
        }
        public String getName(){
            return name;
        }

        //setter
        public void setph(int Ph){    //constructor made
            this.Ph = Ph;
        }
        public void setname(String name){
            this.name = name;

        }
        public void display(){
            System.out.println("Id :"+ id + "Name" + name);
        }

        public static void main(String[] args) {
            encapGetSet emp = new encapGetSet(10,2121323222,"Vansh");
              Scanner sc = new Scanner(System.in);
            boolean running = true;
            while(running){
              System.out.println("1. Show Details");
              System.out.println("2. Update Phone");
             System.out.println("3. Update Name");
             System.out.println("4. Exit"); 

             int choice = sc.nextInt();
             sc.nextLine();

             switch(choice){
                case 1:
                       System.out.println("Current Detailss"); 
                       System.out.println("Ph" + emp.getPh());
                       System.out.println("Name" +  emp.getName());
                       break;

                 case 2:
                    System.out.println("New ph Details");
                    int newPh = sc.nextInt();
                    sc.nextLine();
                    emp.setph(newPh);            //encap update
                    System.out.println("new update phn no"); 
                    break;

                case 3:
                    System.out.println("new name detail");
                    String newname = sc.nextLine();
                    emp.setname("newname");
                    System.out.println("Nme updated");
                    break;

                case 4:
                    System.out.println("exit");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid");
             }
            }
            
        }


    }

