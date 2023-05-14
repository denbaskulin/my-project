package Denis04_conditional;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberWithTernaryOperator {
    public static void main(String[] args) {
        var number = new Random().nextInt(10);
        var userCase = new Scanner(System.in).nextInt();

        String result = number == userCase ?
                "Congratulations, you guessed the number!" :
                "Sorry, but your number is invalid! Try again later...";

        System.out.println(result);
    }
}
