
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pturn
 */
public class PhLabeler {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean done = false;
        while (!done){
            System.out.println("Enter a pH value (-1 or lower; or 15 or higher to quit):");
            double phValue = keyboard.nextDouble();
            if (phValue < Ph.MIN) {
                done = true;
            } else if (phValue > Ph.MAX) {
                done= true;
             } else {
                Ph pH = new Ph(phValue);
                System.out.println("--> " + pH.label() );
            }
        }
    }
}
