/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package titanic;
import java.text.DecimalFormat;
import java.time.LocalTime;
import java.util.*;
/**
 *
 * @author bbroadstone
 */

public class Titanic {
    
    // Private fields for this class.
    private String[][] titanicData;
    private LocalTime startTime;
    private LocalTime stopTime;

    // Default constructor.
    public Titanic(String[][] titanic) {
        this.titanicData = titanic;
        // Initializes startTime
        this.startTime = LocalTime.now();
    }

    // Creates a menu object beginning the user queries.
    public void passToMenu() {
        Menu menu = new Menu(this.titanicData);
        menu.input();
    }
    
    // Each row is equal to a passenger.
    public void totalPassengers() {
        System.out.println("\nThe total number of passengers on the Titanic was: "
            + titanicData.length);
    }

    // Calculates percent of position 1 = 0 / total.
    public void deadPercent() {
        // DecimalFormat.
        DecimalFormat df = new DecimalFormat("#.00");
        // Counter as double.
        double counter = 0;
        // Loop through each row. 
        for (String[] rows : titanicData) {
            // Test if 2nd dimension [1] position is dead passenger.
            if (rows[1].equals("0")) {
                counter++;
            }
        }
        // Turns counter into percentage.
        counter = (counter / titanicData.length) * 100;
        System.out.println("\n" + df.format(counter) + "% of people aboard the" +
                " Titanic perished.");
    }

    // Same as previous method but for position 1 = 1 / total.
    public void alivePercent() {
        // DecimalFormat.
        DecimalFormat df = new DecimalFormat("#.00");
        double counter = 0;
        for (String[] rows : titanicData) {
            if (rows[1].equals("1")) {
                counter++;
            }
        }
        counter = (counter / titanicData.length) * 100;
        System.out.println("\n" + df.format(counter) + "% of people aboard the" +
                " Titanic survived.");
    }

    // Calculates percentage of survivors at class position.
    public void aliveByClass() {
        // DecimalFormat.
        DecimalFormat df = new DecimalFormat("#.00");
        double firstClass = 0;
        double secondClass = 0;
        double thirdClass = 0;
        for (String[] rows : titanicData) {
            // Tests for class position in array and whether it equals a string value of 1, 2, or 3.
            if (rows[1].equals("1") && rows[0].equals("1")) {
                firstClass++;
            } else if (rows[1].equals("1") && rows[0].equals("2")) {
                secondClass++;
            } else if (rows[1].equals("1") && rows[0].equals("3")) {
                thirdClass++;
            }
        }
        // Turns counter into percentage.
        firstClass = (firstClass / titanicData.length) * 100;
        secondClass = (secondClass / titanicData.length) * 100;
        thirdClass = (thirdClass / titanicData.length) * 100;
        System.out.println("\n" + df.format(firstClass) + "% of the survivors of The Titanic " +
                "were First Class citizens.");
        System.out.println(df.format(secondClass) + "% of the survivors of The Titanic " +
                "were Second Class citizens.");
        System.out.println(df.format(thirdClass) + "% of the survivors of The Titanic " +
                "were Third Class citizens.");
    }

    // Same as previous method but for the third position.
    public void aliveByGender() {
        // DecimalFormat.
        DecimalFormat df = new DecimalFormat("#.00");
        double male = 0;
        double female = 0;
        for (String[] rows : titanicData) {
            if (rows[1].equals("1") && rows[3].equals("male")) {
                male++;
            } else if (rows[1].equals("1") && rows[3].equals("female")) {
                female++;
            }
        }
        male = (male / titanicData.length) * 100;
        female = (female / titanicData.length) * 100;
        System.out.println("\n" + df.format(male) + "% of the survivors of The Titanic " +
                "were male.");
        System.out.println(df.format(female) + "% of the survivors of The Titanic " +
                "were female.");
    }

    // Method prints name of position 5 > $200.
    public void highFare() {
        System.out.println("\nThe following passengers paid more than $200 " +
                "for their tickets:");
        // Loop through each row. 
        for (String[] rows : titanicData) {
            // Try-Catch deals with null.
            try {
                // Test position 5 > $200.
                if (Double.parseDouble(rows[5]) > 200) {
                    // Print name.
                    System.out.println(rows[2]);
                }
            } catch (Exception e) {
                //Continue if null.
            }
        }
    }

    // Method prints name when position 1 is dead and position 4 < 10.
    public void deadUnderTen() {
        System.out.println("\nThese are the names of the persons under the age of 10 " +
                "years old who died subsequent to the sinking of The Titanic. ");
        for (String[] row : titanicData) {
            // Try-Catch for null.
            try {
                // Test if position 1 is dead.
                if (row[1].equals("0")) {
                    // And tests if position 4 < 10.
                    if (Double.parseDouble(row[4]) < 10) {
                        // Prints name.
                        System.out.println(row[2]);
                    }
                }
            } catch (Exception e) {
                //Continue if null.
            }
        }
    }

    // Same as previous method but position 1 is alive.
    public void aliveUnderTen() {
        System.out.println("\nTThese are the names of the persons under the age of 10 " +
                " years old who survived the sinking of The Titanic. ");
        for (String[] rows : titanicData) {
            try {
                if (rows[1].equals("1")) {
                    if (Double.parseDouble(rows[4]) < 10) {
                        System.out.println(rows[2]);
                    }
                }
            } catch (Exception e) {
                //Continue if null.
            }
        }
    }

    // Method to print count by each passenger's first letter of last name.
    public void totalByLetter() {
        // Create an array list of characters.
        ArrayList<Character> letters = new ArrayList<>();
        for (int i = 0; i < titanicData.length; i++) {
            // Adds to list upper case first letter from array.
            letters.add(titanicData[i][2].toUpperCase().charAt(0));
        }

        System.out.println("\nFor each letter in the alphabet," +
                " here is a count of all passengers' names starting with that letter:");

        // Create a set of characters with all letters.
        Set<Character> chars = new HashSet<>(letters);
        // Loop through each character in set.
        for (Character ch : chars) {
            // Total number equal to object.
            System.out.println(ch + ": " + Collections.frequency(letters, ch));
        }
    }

    // Quit method.
    public void quitProgram() {
        System.out.println("\nThank you for trying the Titanic Program.");
        // Initializes stopTime
        this.stopTime = LocalTime.now();
        System.out.println("\nElapsed time in seconds was: " +
                // Gets the time between startTime and stopTime
            java.time.Duration.between(this.startTime, this.stopTime)
                .getSeconds()); // Converted to seconds
    }

}







