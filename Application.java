
import java.util.Scanner;

public class Application {
    static public Scanner sc = new Scanner(System.in);

    static public Berth berths = new Berth();

    static public Vehicle vehicle = new Vehicle();
    public static void main(String[] args) {

        printMainMenu();
        String userInput = askUserForInput();

        while (true) {


            if (userInput.equals("1")) {
                berths.seeParkedTrucks();
            } else if (userInput.equals("2")) {
                vehicle.registerNewTruck();
            } else if (userInput.equals("3")) {
                System.out.println("Shutting down");
                System.exit(0);
            }
        }
    }


    static public String askUserForInput() {
        System.out.print("Input: ");
        String userInput = sc.next();

        if (userInput.equals("quit")) {
            main(null);
        }
        return userInput;
    }

    static public void printMainMenu() {
        System.out.println("""
                Choose one of the following options:
                1. See parked trucks
                2. Register a new truck
                3. Exit the program
                """);
    }
}






