/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuelefficiency;

import java.util.Scanner;

/**
 *
 * @author ardol7945
 * @version 8.0
 * @since 2016-11-01 
 * 
 * This a fuel efficiency program.It will ask the user to
 * enter liters; after the user puts liters it will calculate the corresponding
 * kilometers a known vehicle ("vechile") will travel.
 */
public class FuelEfficiency {

    /**
     * main Method
     *
     * @param args the command line arguments 
     * des: Runs a program that asks the
     * user to choose their liters and displays a corresponding kilometers
     */
    public static void main(String[] args) {
        //creates a new array that has stroes all the supclasses of vechicles in 4 indexes
        Vechile[] vechicles = {new Truck(), new Motorcycle(), new Hybrid(), new Car()};
        int lenght = vechicles.length;
        double liters;
        //creates an another array that will stroe all the getDistance values
        double[] getDistanceArray;
        Scanner input = new Scanner(System.in);

        System.out.println("How many liters will you use?");
        liters = input.nextDouble();

        getDistanceArray = distanceMethod(vechicles, liters, lenght);
        displayDistance(getDistanceArray, lenght, vechicles);

        // TODO code application logic here
    }

    /** Method 
     *des:stores the getDistance method values of all the Vechile object
     * values into an another array 
     * pre:none 
     * post:creates a new array sets it into
     * the lenght of all the statements in the vechicle's array. runs a loop to
     * store the getDistance array values into the distance array
     *
     */

    public static double[] distanceMethod(Vechile[] vechicles, double liters, int lenght) {
        double[] distances = new double[lenght];

        for (int i = 0; i <= (lenght - 1); i++) {
            distances[i] = vechicles[i].getDistance(liters);

        }
        return distances;
    }

    /**Method
     * des:displays all the components of the getDistance array and the
     * names of all the subclasses of Vechile 
     * pre:none 
     * post:Runs a loop minus lenght-1 times. Displays all the components of the getDistanceArray and
     * all getName methods of vechicle objects
     */

    public static void displayDistance(double[] getDistanceArray, int lenght, Vechile[] vechicle) {
        for (int i = 0; i <= (lenght - 1); i++) {
            
            System.out.println(vechicle[i].getName() + ": " + getDistanceArray[i] + "Km");
        }
    }

}
