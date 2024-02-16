import java.util.ArrayList;
public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> ListA = new ArrayList<Integer>();
        ArrayList<Integer> ListB = new ArrayList<Integer>();
        ListA.add(9);
        ListA.add(5);
        ListB.add(6);
        ListB.add(0);
        ListB.add(4);
        System.out.println("Maximum number is: " + findMax(ListA, ListB));
    }
    public static int findMax(ArrayList<Integer> ListA, ArrayList<Integer> ListB ){
        int max =   Integer.MIN_VALUE;
        for(int i=0; i<ListA.size(); i++){
            if(ListA.get(i)>max){
                max = ListA.get(i);
            }
        }
        for(int i=0; i<ListB.size(); i++){
            if(ListB.get(i)>max){
                max = ListB.get(i);
            }
        }
        return max;
    }
}


/*

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> Constellations = new ArrayList<String>();
        Constellations.add("Leo");
        Constellations.add("Virgo");
        Constellations.add("Capricorn");
        Constellations.add("Scorpio");
        Constellations.add("Pisces");
        Constellations.add("Aries");
        Constellations.add("Taurus");
        Constellations.add("Cancer");
        Constellations.add("Libra");
        Constellations.add("Gemini");
        for (String constellation : Constellations) {
            System.out.println(constellation);
        }
    }
}
*/