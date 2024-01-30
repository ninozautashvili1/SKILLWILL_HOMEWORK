/*დაწერე მეთოდი, რომელსაც გადაეცემა ორი რიცხვი და დააბრუნე პირველი რიცხვი
მეორე რიცხვის ხარისხში. მაგალითად თუ გადმოგვეცა 2 და 3 უნდა დავაბრუნოთ
8(2*2*2) (გამოიყენეთ loop ები */
public class Task1 {
    public static void main(String[] args) {
        int a = 3;
        int b = 0;
        System.out.println(power(a,b));
    }
    // This method eliminates a^b
    static int power(int a, int b){
        int pow = 1;
        for(int i=0; i<b; i++){
            pow *=a;
        }
        return pow;
    }
}