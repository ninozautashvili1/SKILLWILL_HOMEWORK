interface something{
    void hello(String text);
    void hello(String text, int num);
}
public class Task1 implements something {
    @Override
    public void hello(String text, int num) {
       for(int i=0; i<num; i++){
           System.out.println(text);
       }
    }
    @Override
    public void hello(String text){
        System.out.println(text);
    }
    public static void main(String [] args){
        Task1 t = new Task1();
        t.hello("MONEY ",3);
        t.hello("MUST BE FUNNY");
    }

}
