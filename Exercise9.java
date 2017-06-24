import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by aishwarya on 24/6/17.
 */
public class Exercise9 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        List l=generate(n);
        for( Object i:l){
            System.out.println(i);
        }
    }

    private static ArrayList generate(int n) {
        List list1=new ArrayList();
        while (n % 2 == 0) {
            list1.add(2);
            n=n/2;
        }
        for(int i=3;i<=Math.sqrt(n);i=i+2){
            while(n%i==0){
                list1.add(i);
                n=n/i;
            }
        }
        if(n>2)
            list1.add(n);
        return (ArrayList) list1;
    }
}
