 abstract class Car{
  abstract void speed();
  abstract void color();
  void numOfWheels(){
      System.out.println(4);
  }

}
class BMW extends Car{
    @Override
    void speed(){
        System.out.println(300);
    }
    @Override
    void color(){
        System.out.println("black");
    }
}
 class Toyota extends Car{
    @Override
     void speed(){
         System.out.println(280);
     }
     @Override
     void color(){
         System.out.println("purple");
     }
 }

public class Task2 {
    public static void main(String[] args) {
        System.out.println("BMW : ");
        BMW bmw = new BMW();
        bmw.speed();
        bmw.color();
        bmw.numOfWheels();
        System.out.println("TOYOTA: ");
        Toyota toy = new Toyota();
        toy.speed();
        toy.color();
        toy.numOfWheels();

    }
}
