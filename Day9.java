import java.util.*;

public class Day9{
    public static void main(String argsp[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int Sum_odd = sum(n);
        System.out.println(Sum_odd);

        sc.close();
    }

    public static int sum(int n){
        int sum=0;
        for (int i=0; i<n; i++){
            if (n%2==0){
                break;
            }
            else{
                sum = sum +n;
            }
        }

        return sum;
    }
}
