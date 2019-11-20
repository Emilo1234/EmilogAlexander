
package workshop_emil.alex;

import java.util.ArrayList;
import java.util.List;

public class BuildingSystem {
  
    private List<Building> buildings;

    /**
     * Instantiates a new BuildingSystem.
     */
    public BuildingSystem(){
        buildings = new ArrayList<>();

        Building UCL = new Building("noob stedet");
        Building sdu = new Building("Syddansk universitet");
<<<<<<< HEAD
        addBuilding(sdu);
        addBuilding(UCL);
        
        Sensor sensor = new Celsius("Sensor1", 20);
        Sensor sensor2 = new ppm ("Sensor2", 2);
        sdu.addSensor(sensor);
        sdu.addSensor(sensor2);
        
        
        
=======
        Celsius celsius = new Celsius("SDU Sensor 1", 20);
        sdu.addSensor(celsius);
>>>>>>> f9d6b45a252a8e97af1a9f861c4a868f01900fd3
        Actuator actuator = new Actuator("SDU Actuator 1", 22);
        sdu.addActuator(actuator);
       

        for(Building building : buildings){
            building.getSensors().get(0).toString();
        }
        printBuildings();
        
    }

    /**
     * Add building.
     *
     * @param building the building
     */
    public void addBuilding(Building building){
        buildings.add(building);
    }

    /**
     * Remove building.
     *
     * @param building the building
     */
    public void removeBuilding(Building building){
        buildings.remove(building);
    }
    
    public void printBuildings ()
    {
        for ( int i = 0 ; i < buildings.size() ; i++ )
        {
           System.out.println(buildings.get(i)); 
        }
       
    }
  
}  
