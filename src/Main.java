import java.util.Scanner;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {

        boolean negative = false;
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number < 0){
            negative = true;
            number = -number;
        }

        String stringNumber = String.valueOf(number);
        Stack<Character> stack = new Stack<>();

       for (char num : stringNumber.toCharArray() ){
            stack.push(num);
       }

        StringBuilder reversNumber = new StringBuilder();

       if (negative)
           reversNumber.append('-');

        while (!stack.isEmpty()) {
                reversNumber.append(stack.pop());
        }

        System.out.println("Число с обратным порядком: " + reversNumber);
    }
}