/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop_emil.alex;

/**
 *
 * @author emilo
 */
public class Sensor {
    private String name;;
    private int value;

    /**
     * Instantiates a new Sensor.
     *
     * @param name  the name
     * @param type  the type
     * @param value the value
     */
   

    /**
     * Gets value.
     *
     * @return the value
     */
    public int getValue() {
        return value;
    }
     public String getName() {
        return name;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
  
    /*@Override
    public String toString() {
        String after = "";
        if(type ==  SensorType.TEMPERATURE) after = " Celcius";
        else after = " ppm";
        return name + " " + type.toString().toLowerCase() + " " + value + after;
    } */
}
