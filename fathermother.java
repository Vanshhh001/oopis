//multiple inheri through interface
 interface fathermother {
   void fatherproperty();
    
   interface mother{
    void motherproperty();
   }

    class Son implements fathermother,mother{
    @Override
    public void fatherproperty(){
        System.out.println("40 tolaaaa");
    }
    @Override
    public void motherproperty(){
        System.out.println("avshsha");
    }
   }
   public static void main(String[] args) {
    Son s = new Son();
    s.fatherproperty();
    s.motherproperty();
   }

}
