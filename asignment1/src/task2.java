/* დაწერე მეთოდი, რომელსაც გადაეცემა 3
სტრინგი და აბრუნებს ამსტრინგების სიგრძეების ჯამს
*/
public class task2 {
    public static void main(String[] args) {
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
