import java.util.Scanner;

/**
 * Created by aishwarya on 24/6/17.
 */
public class Exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n!=0) {
            for (; n > 1; n--)
                System.out.println("*");
            System.out.print("*");
        }
    }
}
