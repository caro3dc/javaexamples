import java.util.Scanner;

class userInput01 {
    public static void main(String[ ] args) {
        System.out.print("Please enter your initials: "); // prints
        Scanner x = new Scanner(System.in); // requests input after print
        System.out.println("Hello, " + x.nextLine() + "!"); // x.nextLine() is String inputted
        }
}
