package People;
import Enum.*;
import Locations.*;
public abstract class Human {
    protected String name;
    protected String post;
    protected Locations location;
    public abstract void say(Replicas replica, String move);
    public abstract  void see(View view, String move);
    public String toString(){
        return  name;
    }
}