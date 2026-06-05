import java.util.Scanner;
public class Countdigits {
    public static void main(String[] args){
        Scanner IN = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = IN.nextInt();
        int count = 0;
        while(num != 0){
            num = num / 10;
            count++;
        }
        System.out.println("Number of digits = " + count);
        IN.close();
    } 
}
