import java.util.*;
class Car {
}
public class Task2 {
    public static void main(String[] args) {
        Map<Integer, List<Car>> production = new HashMap<>();
        List<Car>  list1 = new ArrayList<>();
        list1.add(new Car());
        List<Car>  list2 = new ArrayList<>();
        list2.add(new Car());
        list2.add(new Car());
        List<Car>  list3 = new ArrayList<>();
        list3.add(new Car());
        list3.add(new Car());
        list3.add(new Car());
        production.put(1920, list1);
        production.put(1921, list2);
        production.put(1923, list3);

        int maxYear = findYearWithMostCars( production );
        System.out.println("Max number of cars were produced in : " + maxYear);
    }
    public static int findYearWithMostCars(Map<Integer, List<Car>> production){
        int maxNumCars = 0;
        int maxYear = 0;
        for(int x : production.keySet()){
            List<Car> producedCar = production.get(x);
            if(producedCar.size()> maxNumCars){
                maxNumCars = producedCar.size();
                maxYear = x;
            }
        }
        return maxYear;
    }
}