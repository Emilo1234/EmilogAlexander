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
    
    public ppm (){
        super();
        type = "ppm";
    }
    @Override
    public String toString()
    {
        return type;
    }
            
            
          
}
