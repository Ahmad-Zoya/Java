import java.util.*;

public class Day8{
    public static void main(String argsp[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int average = aver(a, b, c);
        System.out.println(average);

        sc.close();
    }

    public static int aver(int a, int b, int c){
        int average = (a+b+c)/3;
        return average;
    }
}
