import java.util.*;

public class Day7 {

    public static int fact(int n){

        if (n<0){
            System.out.println("Invalid no.");
            return -1;
        }

        int factorial = 1;

        for(int i=n; i>=1; i--){
            factorial = factorial*i;
        }

        return factorial;
    }

    public static void main(String argsp[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int fact_n = fact(n);
        System.out.println(fact_n);

        sc.close();
    }
}
