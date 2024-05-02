import java.util.*;

public class Day02 {
    public static void main(String argsp[]){
        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // if (age>18){
        //     System.out.println("Adult");
        // }
        // else{
        //     System.out.println("Not Adult");
        // }
        
        // int no = sc.nextInt();
        // if(no%2==0){
        //     System.out.println("Even no.");
        // }
        // else{
        //     System.out.println("Odd no.");
        // }

        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // if (a==b){
        //     System.out.println("Equal");
        // }
        // else{    
        //     if (a>b){
        //             System.out.println("Greater");
        //         }
        //         else{
        //             System.out.println("Lesser");
        //         }
        // }

        int button = sc.nextInt();
        // if (button==1){
        //     System.out.println("Hello");
        // }
        // else if (button==2){
        //     System.out.println("Namaste");
        // }
        // else if (button==3){
        //     System.out.println("Bonjour");
        // }
        // else{
        //     System.out.println("Invalid");
        // }

        switch (button) {
            case 1: System.out.println("Hello");
                break;
            case 2: System.out.println("Namaste");
                break;
            case 3: System.out.println("Bonjour");
                break;
            default: System.out.println("Invalid");
        }
        

        sc.close();
    }
}
