import java.util.ArrayList;

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
