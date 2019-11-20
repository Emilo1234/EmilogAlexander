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
<<<<<<< HEAD
    private String name; 
    private int value; 
    
    public Celsius (String name, int value){
        this.name = name;
        this.value = value; 
        type = "Temperature sensor";
=======
    private int value; 
    
    public Celsius (Name name, Value value){
        this.value = super.getValue();
        this.name = super.getName();
        type = "Celsius";
>>>>>>> f9d6b45a252a8e97af1a9f861c4a868f01900fd3
    }
    @Override
    public String toString()
    {
        return name + " is  '" +  type + "' and the value is " + value+ "Degrees";
    }
    
    
}
