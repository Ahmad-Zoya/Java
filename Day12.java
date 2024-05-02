public class Day12 {
    public static void main(String argsp[]){
                
                int num1 = 36;
                int num2 = 60;
                System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd(num1, num2));
            }
        
            
            public static int gcd(int a, int b) {
                while (b != 0) {
                    int temp = b;
                    b = a % b;
                    a = temp;
                }
                return a;
            }
        }
        
    

