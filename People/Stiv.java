package People;
import Enum.*;
import Locations.*;
public class Stiv extends Human{
    public Stiv(String name, String post){
        this.name = name;
        this.post = post;
    }
    @Override
    public void say(Replicas replica, String move) {
        System.out.printf("- %s, - %s %s.\n", replica, move, name);
    }
    @Override
    public void see(View view, String move) {
        System.out.printf("%s %s %s.\n", name, move, view);
    }
    public void demonstrate(String move, Hospital hospital) {
        System.out.printf("%s, %s, %s Луису %s.\n", name, post, move, hospital);
    }
    public void talk(String move){
        System.out.printf("%s %s его в историю последних двух лет.\n", name, move);
    }
    public void feeling3(Feel feel, String move1, String move2){
        if (Feel.PRIDE == feel){
            System.out.printf("%s %s, %s %s что, ", move1, feel, name, move2);
        }
    }
}
