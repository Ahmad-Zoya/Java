import java.util.*;

public class Day11 {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();  

        double circum = circumference(r);  
        System.out.println(circum);
        sc.close();
    }

    public static double circumference(double r) {
        double cir = 2 * Math.PI * r;  
        return cir;
    }
}