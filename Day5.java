public class Day5 {
    public static void main (String argsp[]){
        //butterfly pattern
        int n=5;
        for (int i = 1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }

            int spaces = 2*(n-i);
            for (int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            for (int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = n; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }

            int spaces = 2*(n-i);
            for (int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            for (int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }


        System.out.println();
        System.out.println();

        //solid rhombus
        for (int i=1; i<=n; i++){
            int spaces;
            spaces = 5-i;
            for (int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=5; j++){
                System.out.print("*");
            }

            for (int j=0; j<=(9-spaces); j++){
                System.out.print(" ");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println();

        //number pyramid
        for (int i=0; i<=5; i++){
            for (int j=0; j<=5-i; j++){
                System.out.print(" ");
            }

            for (int j=1; j<=i; j++){
                System.out.print(i);
                System.out.print(" ");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println();

        //palindromic pattern
        for (int i=0; i<=5; i++){
            for (int j=0; j<=5-i; j++){
                System.out.print(" ");
            }

            for (int j=i; j>=1; j--){
                System.out.print(j);
                //System.out.print(" ");
            }

            for (int j=2; j<=i; j++){
                System.out.print(j);
                //System.out.print(" ");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println();

        //diamond pattern
        for (int i=0; i<=5; i++){
            for (int j=0; j<=5-i; j++){
                System.out.print(" ");
            }

            for (int j=i; j>=1; j--){
                System.out.print("*");
                //System.out.print(" ");
            }

            for (int j=2; j<=i; j++){
                System.out.print("*");
                //System.out.print(" ");
            }

            System.out.println();
        }

        for (int i=4; i>=1; i--){
            for (int j=0; j<=5-i; j++){
                System.out.print(" ");
            }

            for (int j=i; j>=1; j--){
                System.out.print("*");
                //System.out.print(" ");
            }

            for (int j=2; j<=i; j++){
                System.out.print("*");
                //System.out.print(" ");
            }

            System.out.println();
        }

    }
}
