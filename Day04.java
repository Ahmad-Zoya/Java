public class Day04 {
    public static void main(String argsp[]){
        
        //solid rectangle
        int l=4;
        int b=5;

        for (int i=0; i<l; i++){
            for (int j=0; j<b; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        //hollow rectangle
        for (int i=0; i<l; i++){
            for (int j=0; j<b; j++){
                if (i==0||i==l-1||j==0||j==b-1)
                    System.out.print("*");
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        //half pyramid
        for (int i=0; i<4; i++)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        //inverted half pyramid
        for(int i=0; i<4; i++)
        {
            for(int j=0; i+j<4; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        //inverted half pyramid (180 deg)
        int n=4;
        for (int i=1 ; i<=n; i++)
        {
            for (int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        //half pyramid with numbers
        for (int i=0; i<=4; i++)
        {
            int counter = 1;
            for (int j=0; j<=i; j++)
            {
                
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        //inverted half pyramid with numbers
        for(int i=0; i<=5; i++)
        {
            int counter =1;
            for(int j=0; i+j<5; j++){
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        //floyd's triangle
        int counter = 1;
        for (int i=0; i<=4; i++)
        {
            for (int j=0; j<=i; j++)
            {
                
                System.out.print(counter);
                System.out.print(" ");
                counter++;
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        //0-1 triangle
        for (int i=0; i<=4; i++)
        {
            for (int j=0; j<=i; j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }

    }
    
}
