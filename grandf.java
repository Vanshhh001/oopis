
//chain of inheritance (multilevel inheritace)
public class grandf {
    String name = "sass";
    
    void Lproperty(){
  System.out.println("500 acre of land");
    }


    static class father extends grandf{
        String name = "Vanshh";
        void Mproperty(){
            System.out.println("2 bhk flat");
        }
    }
     static class son extends father{
        String name = "hduwhd";

    }
    public static void main(String[] args) {
        son s = new son();
        s.Lproperty();
        s.Mproperty();
    }
}


