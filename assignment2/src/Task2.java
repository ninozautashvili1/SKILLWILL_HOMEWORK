/*დაწერე მეთოდი, რომელსაც გადაეცემა ცხოველის სახელი (სტრინგად). ამ მეთოდმა
ძაღლის, კატის, ლომის, ღორის შემთხვევაში უნდა დაწეროს შესაბამისი
სიტყვა. მაგალითად ძაღლის შემთხვევაში "I am the dog" და ა.შ. ხოლო სხვა
ცხოველების შემთხვევაში "I Am an Animal" */
public class Task2 {
    public static void main(String[] args) {
        String txt = "COW";
        checkAnimal(txt.toLowerCase());
    }
    static void checkAnimal(String animal) {
        switch (animal) {
            case "dog":
                System.out.println("I am the dog");
                break;
            case "cat":
                System.out.println("I am the cat");
                break;
            case "lion":
                System.out.println("I am the lion");
                break;
            case "pig":
                System.out.println("I am the pig");
                break;
            default:
                System.out.println(" I Am an Animal");
        }
    }
}
