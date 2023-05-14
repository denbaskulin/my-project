package Denis03_expression;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.println("Enter 'a': ");
        var a = new Scanner(System.in).nextInt();
        System.out.println("Enter 'b': ");
        var b = new Scanner(System.in).nextInt();

        var aPlusB = a + b;
        var aMinB = a - b;
        var aMulB = a * b;
        var aDivB = a / b;
        var aModB = a % b;

        System.out.println("a + b = " + aPlusB);
        System.out.println("a - b = " + aMinB);
        System.out.println("a * b = " + aMulB);
        System.out.println("a / b = " + aDivB);
        System.out.println("a % b = " + aModB);
    }
}
