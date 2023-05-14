package Denis04_conditional;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        var a = 5;
        var b = 8;

        if (a > b) {
            var result = "a > b";
            System.out.println(result);

            if (a > b) {
                System.out.println("a > b");
            } else {
                System.out.println("a <= b");
            }
        }

        //
        if (a > b) {
            System.out.println("a > b");
        } else {
            if (a < b) {
                System.out.println("a < b");
            } else {
                System.out.println("a = b");
            }
            System.out.println("after");
        }

        //
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
        //
        boolean condition = a > b;
        if (condition) {
            System.out.println("condition=true");
        }
        //
        if (condition || a < b && a > 1 || !(b < 7)) {
            System.out.println("Complexe condition example");

        }
    }

}