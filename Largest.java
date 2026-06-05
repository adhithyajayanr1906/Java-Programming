import java.util.Scanner;
public class Largest {
    public static void main(String[] args){
        Scanner IN = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int a = IN.nextInt();
        System.out.println("Enter second Number: ");
        int b = IN.nextInt();
        System.out.println("Enter third Number: ");
        int c = IN.nextInt();
        if(a >= b && a >= c){
            System.out.println("The largest numbers is " + a);
        }
        else if(b >= c && b >= a){
            System.out.println("The Largest number is " + b);
        }
        else{
            System.out.println("The Largest number is " + c);
        }
        IN.close();
    }
}
