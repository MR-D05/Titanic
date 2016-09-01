/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package titanic;
import java.util.Scanner;
/**
 *
 * @author bbroadstone
 */
public class Menu extends Titanic {

//Private fields for this class.
    
    private static Boolean runState = true;
    private Scanner input = new Scanner(System.in);
    private String choice;

//Default constructor.
    
    public Menu(String[][] data) {
        super(data);
    }

//Method displaying menu.
    
    public void createMenu() {
        System.out.println("\n*********Welcome to the Titanic Statistical Application" +
                "**************************\n");
        System.out.println("Enter the number of the question you want answered. " +
                "Enter 'Q' to quit the program:\n");
        System.out.println("1. How many passengers were on the Titanic?");
        System.out.println("2. What percentage of passengers perished on the Titanic?");
        System.out.println("3. What percentage of passengers survived the sinking of" +
                "the Titanic?");
        System.out.println("4. What percentage of passengers survived for each of the " +
                "three classes?");
        System.out.println("5. What percentage of passengers survived as a function " +
                "of gender?");
        System.out.println("6. What specific passengers paid more than $200 for their" +
                " tickets?");
        System.out.println("7. What specific passengers who were less than 10 years old" +
                " perished on the Titanic?");
        System.out.println("8. What specific passengers who were less than 10 years old" +
                " survived the sinking of the titanic?");
        System.out.println("9. For each letter in the alphabet, how many passengers last" +
                " names started with that letter?");
        System.out.println("Q. Quit the program.");
        System.out.print("\nEnter your selection: ");
    }

//Method putting menu in a do/while loop.
    
    public void input() {
        do {
            createMenu();
            choice = input.next().toLowerCase();
            // Runs the various methods from Titanic depending on user input.
            switch (choice) {
                case "q" : quitProgram();
                    runState = false;
                    break;
                case "1" : totalPassengers();
                    break;
                case "2" : deadPercent();
                    break;
                case "3" : alivePercent();
                    break;
                case "4" : aliveByClass();
                    break;
                case "5" : aliveByGender();
                    break;
                case "6" : highFare();
                    break;
                case "7" : deadUnderTen();
                    break;
                case "8" : aliveUnderTen();
                    break;
                case "9" : totalByLetter();
                    break;
                default:
                    System.out.println("\nPlease enter a valid choice.");
                    break;
            }
            
//Method terminated when runState resloves false. 

        } while (runState);
    }
}