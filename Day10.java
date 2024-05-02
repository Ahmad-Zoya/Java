import java.util.*;

public class Day10 {
    public static void main(String argsp[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int greater = Great(a, b);
        System.out.println(greater);
        sc.close();

    }

    public static int Great(int a, int b){

        int greater = 0;
        if (a>b){
            greater = a;
        }
        else{
            greater=b;
        }

        return greater;
    }
}
