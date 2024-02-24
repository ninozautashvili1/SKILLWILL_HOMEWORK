public class StrToInteger {
    public static void main(String[] args) {
        System.out.println(stringToInteger("12"));
        System.out.println(stringToInteger("87"));
        System.out.println(stringToInteger("-412"));
        System.out.println(stringToInteger("-157"));
    }
    public static int stringToInteger(String text){
        return Integer.parseInt(text);
    }
}
