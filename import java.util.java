import java.util.scanner;
public class numbers{
    public static void main(string[] args){
        scanner input = new scanner (system.in);
        double num1, num2, num3, num4, num5;
        double average;

        
        system.out.print("enter first number:");
        num1 = input.nextdouble();
        system.out.print("enter second number:");
        num2 = input.nextdouble();
        system.out.print("enter third number:");
        num3 = input.nextdouble();
        system.out.print("enter fourth number:");
        num4 = input.nextdouble();
        system.out.print("enter fifth number:");
        num5 = input.nextdouble();
        average = (num1 + num2 + num3 + num4 + num5)/5;
        system.out.printf("average = %.3f", + average);
        input.close();


    }
}