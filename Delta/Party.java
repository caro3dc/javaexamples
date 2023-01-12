package Delta;

import java.util.Scanner;

public class Party {
    private int numGuests;

    public int getNumGuests() {
        return numGuests;
    }
    public void setNumGuests(int numGuests) {
        this.numGuests = numGuests; 
    }
    public void displayMessage() {
        System.out.println("Enjoy the party!");
    }

    
}

class BirthdayParty extends Party { }


class Maine {
public static void main(String[] args) {
    
    BirthdayParty bday = new BirthdayParty();
    System.out.print("Enter number of guests: ");
    Scanner h = new Scanner(System.in);
    int i = h.nextInt();
    System.out.println(i + " guests have been invited.");
    bday.setNumGuests(i);
    bday.displayMessage();
}
}