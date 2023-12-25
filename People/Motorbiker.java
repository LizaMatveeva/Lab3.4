package People;
import Interface.*;
import Locations.*;
import Exception.*;

public class Motorbiker implements Drive {
    String name;
    private Boolean overtake;
    public Motorbiker (String name){
        this.name = name;
    }
    public String toString(){
        return name;
    }
    @Override
    public void drive(Transport transport, String move, Locations location) {
    }
    @Override
    public void slowDown(String move,Transport transport, String move2, Motorbiker motorbiker){}
    public void overtake(int overandom)throws MotorbikerException{
        if (overandom == 0){
            this.overtake = false;
            throw new MotorbikerException("Не хочет, чтобы его пропустили");
        }
        else {
            this.overtake = true;
            System.out.println(name + " хочет, чтобы его пропустили.");
        }
    }
    public boolean getOvertake(){
        return overtake;
    }
}
