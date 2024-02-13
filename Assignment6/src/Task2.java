public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {10,3,5,2,6,7,8,3};
        int x = 23;
        findIndex(numbers, x);
    }
    private static void findIndex(int[] numbers, int x){
        boolean found = false;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==x){
                System.out.println(x + " is at index: " + i);
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("Can not find!");
        }
    }
}
