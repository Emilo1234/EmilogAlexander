/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop_emil.alex;

import java.util.ArrayList;
import java.util.List;

public class Building {

    private String name;
    private List<Sensor> sensors;
    private List<Actuator> actuators;

    public Building(String name){
        this.name = name;
        this.sensors = new ArrayList<>();
        this.actuators = new ArrayList<>();
    }

    public void addSensor(Sensor sensor){
        sensors.add(sensor);
    }

    public void addActuator(Actuator actuator){
        actuators.add(actuator);
    }

    public void removeSensor(Sensor sensor){
        sensors.remove(sensor);
    }

    public void removeActuator(Actuator actuator){
        actuators.remove(actuator);
    }

    public List<Actuator> getActuators() {
        return actuators;
    }

    public List<Sensor> getSensors() {
        return sensors;
    }
}

