import java.util.Arrays;

public class EvenNumbers {
    public static void main(String[] argc){
        System.out.println("Hello World!");
        System.out.println("Even numbers are");
        System.out.println(Arrays.toString(get_even_numbers(10)));
    }

//    This below function has 2 issues.
//    One is logical and another one can surface during run time
//    Fix both of them via branch and then merge into master
    public static int[] get_even_numbers(int max) {
        int[] even_numbers = new int[10];
        int counter=0;
        for (int i=0; i<=max; i++){
            if (i % 2 != 0){
                even_numbers[counter]=i;
                counter++;
            }
        }
        return even_numbers;
    }
}