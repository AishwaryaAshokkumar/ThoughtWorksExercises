/**
 * Created by aishwarya on 24/6/17.
 */
public class Exercise8 {
    public static void main(String[] args) {
        FizzBuzz();
    }

    private static void FizzBuzz() {
        for(int i=1;i<=100;i++){
            if(i%3==0 && i%5==0)
                System.out.println("FizzBuzz");
            else if(i%3==0)
                System.out.println("Fizz");
            else if(i%5==0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }
}
