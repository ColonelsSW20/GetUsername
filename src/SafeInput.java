
import java.util.Scanner;

public class SafeInput {

    public static String getNonZeroLenString(Scanner pipe, String prompt) {

        String retString = "";

        do {
            System.out.print(prompt + ": ");
            retString = pipe.nextLine();

            if (retString.length() == 0) {
                System.out.println("You must enter something. Please try again.");
            }

        } while (retString.length() == 0);

        return retString;
    }
}