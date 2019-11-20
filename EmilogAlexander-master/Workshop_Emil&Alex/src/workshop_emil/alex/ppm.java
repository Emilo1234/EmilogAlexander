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
public class ppm extends Sensor{
   private String type;
    private String name; 
    private int value; 
    
<<<<<<< HEAD
    public ppm (String name, int value){
        this.name = name;
        this.value = value; 
        type = "Parts per milions sensor";
=======
    public ppm (){
        super();
        type = "ppm";
>>>>>>> f9d6b45a252a8e97af1a9f861c4a868f01900fd3
    }
    @Override
    public String toString()
    {
        return name + " is  '" +  type + "' and the value is " + value+ "ppm";
    }
            
            
          
}
