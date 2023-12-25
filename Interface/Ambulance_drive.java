package Interface;
import Locations.*;

public interface Ambulance_drive {
    void ambulanceDrive(Transport transport, String move);
    void ambulanceDeliver(boolean ill, Transport transport, String move, Hospital hospital);
}
