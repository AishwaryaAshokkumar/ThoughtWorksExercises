import java.util.Scanner;

/**
 * Created by aishwarya on 24/6/17.
 */
public class Exercise6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        //if(n%2!=0) {
        int space=n-1,star=1,i;
        while(space>=0){
            for(i=0;i<space;i++)
                System.out.print(" ");
            for(i=0;i<star;i++)
                System.out.print("*");
            space--;
            star=star+2;
            System.out.println();
        }
        space=1;
        star=star-4;
        while(space<=n-1){
            for(i=0;i<space;i++)
                System.out.print(" ");
            for(i=0;i<star;i++)
                System.out.print("*");
            space++;
            star=star-2;
            System.out.println();
        }
        //}
    }
}
