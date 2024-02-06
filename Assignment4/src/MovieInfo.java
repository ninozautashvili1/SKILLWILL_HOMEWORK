class Movies {
    private String name;
    private int year;
    private String director;
    private double duration;
    private double imbd;
    Movies(){
    }
    Movies(String name, int year, String director, double duration, double imbd){
        this.name = name;
        this.year = year;
        this.director = director;
        this.imbd = imbd;
        this.duration = duration;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setYear(int year){
        this.year = year;
    }

    public void setDirector(String director){
        this.director = director;
    }
    public void setDuration(double duration){
        this.duration = duration;
    }
    public void setImbd(double imbd){
        this.imbd = imbd;
    }
    public String getName(){
        return name;
    }
    public String getDirector(){
        return director;
    }
    public int getYear(){
        return year;
    }
    public double getDuration(){
        return duration;
    }
    public double getImbd(){
        return imbd;
    }
    public void display() {
        System.out.println("\nname: " + this.getName());
        System.out.println("year: " + this.getYear());
        System.out.println("director: " + this.getDirector());
        System.out.println("duration: " + this.getDuration());
        System.out.println("imbd: " + this.getImbd());
    }

}
public class MovieInfo{
    public static void main(String[] args) {
        String name = "asd";
        int year = 2001;
        String director = "Nino";
        double duration = 1.5;
        double imbd = 9.1;

        Movies movie1 = new Movies();

        movie1.setName("bcd");
        movie1.setYear(2023);
        movie1.setDirector("Julia");
        movie1.setDuration(2.40);
        movie1.setImbd(4.3);

        Movies movie2 = new Movies(name, year, director,duration, imbd);

        movie1.display();
        movie2.display();
    }
}


