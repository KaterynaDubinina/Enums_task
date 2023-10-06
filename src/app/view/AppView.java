package app.view;

import java.util.Scanner;

public class AppView {

    Scanner scanner = new Scanner(System.in);

    public String[] getData() {
        System.out.print("\nThis is a manual start of a traffic light." +
                "\n" + "\nOperator, enter your name: ");
        String adminName = scanner.nextLine().trim();
        System.out.print("Enter the emergency number: ");
        String emergencyNumber = scanner.nextLine().trim();
        System.out.print("Enter the colour of the traffic light \uD83D\uDD34\uD83D\uDFE1\uD83D\uDFE2: ");
        String mode = scanner.nextLine().trim().toUpperCase();
        return new String[] {adminName, emergencyNumber, mode};
    }

    public void getOutput(String output) {
        scanner.close();
        System.out.print(output);
    }
}
