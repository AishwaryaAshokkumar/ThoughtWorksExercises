import java.util.Scanner;

/**
 * Created by aishwarya on 24/6/17.
 */
public class Exercise4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++)
                System.out.print("*");
            if(i!=n)
                System.out.println();
        }
    }
}
