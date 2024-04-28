 import calc.*;
 import java.util.Scanner;
    public class assignment8_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculator c = new calculator();
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();
        System.out.println("Sum: " + c.addition(num1, num2));

        scalculator scal = new scalculator();
        System.out.println("Enter number to calculate its Sine ");
        int calsin = sc.nextInt();
        System.out.println("Sin of " + calsin + ": " + scal.sin(calsin));
        System.out.println("Rectangle Area: " + scal.rectanglearea(2, 4));

        hycalculator hc = new hycalculator();
        hc.both(45, 5);
    }
}