package Locations;
import Interface.*;

public class Transport implements Ambulance_drive {
    private int count_drive;
    private String move;
    private String name;
    private boolean broken;
    public Transport (Boolean broken, String name){
        this.broken = broken;
        this.name = name;
    }
    public String toString(){
        return name;
    }

    @Override
    public void ambulanceDrive(Transport transport, String move) {
        this.move = move;
        count_drive += 1;
    }

    @Override
    public void ambulanceDeliver(boolean ill, Transport transport, String move, Hospital hospital) {

    }

    public int getCount_drive(){
        return count_drive;

    }

}
