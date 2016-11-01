/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuelefficiency;

/**
 * @author ardol7945
 * @version 8.0
 * @since 2016-11-01
 */
abstract class Vechile {

    /** Constructor
     * pre:none 
     * post:none
     */
    public Vechile() {

    }

    abstract double getDistance(double liters);

    abstract String getName();
}
