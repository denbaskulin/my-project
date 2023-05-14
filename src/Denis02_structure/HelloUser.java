package Denis02_structure;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        //System.out.println("What is your name?");
        var name = new Scanner(System.in).nextLine();
        //var result = "Hello " + name;
        //System.out.println(result); МОЖНО И ТАК
        System.out.println("Hello, " + name);
    }
}
