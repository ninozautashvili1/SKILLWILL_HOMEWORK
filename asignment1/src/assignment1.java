public class assignment1 {
    public static void main(String[] args) {
        task1();
        task2();
    }
    /*დაწერე მეთოდი, რომელსაც გადაეცემა 4 რიცხვი და აბრუნებს ამ 4 რიცხვის საშუალოს */
    public static void task1(){
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
    /* დაწერე მეთოდი, რომელსაც გადაეცემა 3
    სტრინგი და აბრუნებს ამსტრინგების სიგრძეების ჯამს */
    public static void task2(){
        String first = "back";
        String second = "end";
        String third = "development";
        System.out.println(sentenceLength(first+second+third));
    }
    //This method returns the length of given text
    static int sentenceLength(String text){
        return text.length();
    }
}
