/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package titanic;
import java.io.*;
import java.util.Scanner;
import java.lang.*;
/**
 *
 * @author bbroadstone
 */

public class TestTitanic {   
    public static void main(String[] args) {
        TestTitanic runner = new TestTitanic();
        
//Calls the program method to fill the array.

        runner.Fill();
    }
    
    public void Fill() {
        try {          
            String content = new Scanner(new File("titanic.txt"))
                    .useDelimiter("\\Z")
                    .next();
            String[] rows = content.split("\n"); 
            String[][] titanic = new String[rows.length][];
            for (int i = 0; i < rows.length; i++) {
            titanic[i] = rows[i].split("\\t");
            }   
            Titanic t1 = new Titanic(titanic);    
            t1.passToMenu();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    } 
}
