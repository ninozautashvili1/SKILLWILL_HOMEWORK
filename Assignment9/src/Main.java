public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setBrand("Nissan");
        vehicle.setModelName("March");
        vehicle.setReleaseYear(1989);
        System.out.println("brand: " + vehicle.getBrand());
        System.out.println("model name: " + vehicle.getModelName());
        System.out.println("release year: " + vehicle.getReleaseYear());

    }
}
