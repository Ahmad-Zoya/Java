import java.util.*;

public class Day6 {

    public static int sum(int a, int b){
        return (a+b);
    }

    public static void printName (String name){
        System.out.println(name);
        return;
    }

    public static void main (String argsp[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        printName(name);

        int Sum = sum(7, 9);
        System.out.println(Sum);

        sc.close();
    }
}
