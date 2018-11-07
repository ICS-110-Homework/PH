/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pturn
 */
public class Ph {

    public static double MIN = 0.0;
    public static double MAX = 14.0;
    public static double NEUTRAL = 7.0;

    public Ph(double pH) {
        if (pH < MIN || pH > MAX) {
            System.err.println("PH(): received invalid pH: " + pH);
            System.exit(1);
        } else {
            myValue = pH;
        }
    }
    public String label() {

        if (myValue < MIN || myValue > MAX ) {
            return "error";
        } else if (myValue < NEUTRAL){
            return "acidic";
        } else if (myValue > NEUTRAL){
            return "alkaline";
        } else {
            return "neutral";
        }
        
    }
    
    
    private double myValue;
    
}


