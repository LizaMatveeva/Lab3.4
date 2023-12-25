package Interface;
import People.*;
import Locations.*;

public interface Drive {
    void drive(Transport transport, String move, Locations location);
    void slowDown (String move, Transport transport, String move2, Motorbiker motorbiker);
}
