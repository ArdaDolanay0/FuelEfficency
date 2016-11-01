/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuelefficiency;

/**
 *
 * @author ardol7945
 * @version 8.0
 * @since 2016-11-01
 */
public class Motorcycle extends Vechile {

    /**Constructor
     * pre:none 
     * post:Initializes defultName, creates a motorcycle
     * object.
     */
    private final double Efficency = 6.3 / 100;
    private String defultName;

    public Motorcycle() {
        defultName = "Motorcycle";
    }

    /**
     * Method pre:none post:creates and initializes a distance variable.
     *
     * @param liters
     * @return distance
     */
    public double getDistance(double liters) {
        double distance;
        distance = liters / Efficency;
        return distance;
    }

    /**
     * Method pre:none post:returns the defultName variable.
     *
     * @return defultName
     */
    public String getName() {
        return (defultName);
    }
}
