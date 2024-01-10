import java.util.Dictionary;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Menu.printMenu();
        while (!Menu.exit){
            Menu.mainMenu();
            System.out.println("Enter your choice to make another operation or choose 7 to Exit: ");
    }
    }
}