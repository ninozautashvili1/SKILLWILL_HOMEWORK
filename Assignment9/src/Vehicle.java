/*შექმენი კლასი Vehicle, რომელსაც ექნება
სამი private ცლავდი: brand და modelName
და releaseYear. დაწერე თიოთოეულისთვის
გეთერი და სეთერი, ასევე გქონდეს ერთი
კონსტრუქტორი, რომლებსაც სამივე
ცვლადი უნდა ჩაეწოდებოდე
*/
public class Vehicle {
   private String brand;
   private String modelName;
   private int releaseYear;
   public String getBrand(){
       return brand;
   }
   public String getModelName(){
       return modelName;
   }
   public int getReleaseYear(){
       return releaseYear;
   }
   public void setBrand(String brand){
       this.brand=brand;
   }
   public void setModelName(String modelName){
       this.modelName=modelName;
   }
   public void setReleaseYear(int releaseYear){
       this.releaseYear=releaseYear;
   }
   public Vehicle(String brand, String modelName, int releaseYear){

   }
   public Vehicle(){

   }

}