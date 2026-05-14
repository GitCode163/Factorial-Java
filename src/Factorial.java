import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        System.out.println("Give me one number: ");

        int i = new Scanner(System.in).nextInt();
        int x = 1;

        for (int j = 1; j <= i; j++) {
            x = x * j;
        }

        System.out.println("Factorial number " + i +" = " + x);
    }
}
