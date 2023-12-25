package People;
import Interface.*;
import Locations.*;

public class Doctor implements Ambulance_drive {
    String post;
    public Doctor(String post){
        this.post = post;}
    @Override
    public void ambulanceDrive(Transport transport, String move){}
    @Override
    public void ambulanceDeliver(boolean ill, Transport transport, String move, Hospital hospital) {
        if (ill){
            System.out.printf("%s на %s %s пациента в %s.\n", post, transport, move, hospital);
        }
        else {
            System.out.printf("%s стоит на месте.\n", transport);
        }
    }
}