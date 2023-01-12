package Echo;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Echo {
    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList<String>();
        x.add("Finn");
        x.add("Jake");
        x.add("Marceline");
        x.add("Princess Bubblegum");
        x.add("Ice King");
    try {
        System.out.print("Choose a number from 0 to 4: ");
        Scanner h = new Scanner(System.in);
        int j = h.nextInt();
        String k = x.get(j);
        System.out.println("You have selected: " + k);

    } catch(IndexOutOfBoundsException ex) {
        System.out.println("Input is out of range! Program stopping...");
        throw(ex);
    } catch(InputMismatchException ex) {
        System.out.println("Input is not a number! Program stopping...");
    }
    }
}
