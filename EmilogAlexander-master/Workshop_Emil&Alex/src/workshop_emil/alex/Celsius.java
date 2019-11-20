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
public class Celsius extends Sensor {
    private String name; 
    private String type;
    private int value; 
    
    public Celsius (Name name, Value value){
        this.value = super.getValue();
        this.name = super.getName();
        type = "Celsius";
    }
    @Override
    public String toString()
    {
        return type;
    }
}
