
public class task1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        System.out.println(average(a,b,c,d));
    }
    //this method returns average of four numbers
    static double average(int a, int b, int c, int d){
        return (double)(a+b+c+d)/4;
    }
}
