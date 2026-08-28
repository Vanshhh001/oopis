//hierchical
public class father {
    void property(){
        System.out.println("dsndsn");
    }

 static class son extends father{
    String name = "Vsas";

}
static class daughter extends father{
    String name = "nnja";

}
public static void main(String[] args) {
    son s = new son();
    System.out.println(s.name);
    s.property();

    daughter d = new daughter();
    System.out.println(d.name);
    d.property();
}
}
