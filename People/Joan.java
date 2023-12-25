package People;
import Enum.*;

public class Joan extends Human {
    int age;
    String hair_color;
    public Joan(String name, String post, int age, String hair_color){
        this.name = name;
        this.post = post;
        this.age = age;
        this.hair_color = hair_color;
    }
    @Override
    public void say(Replicas replica, String move) {
        System.out.printf("- %s, - %s %s.\n", replica, move, name);
    }
    @Override
    public void see(View view, String move) {
    }
    public void lauth(String move){
        System.out.printf("%s %s.\n", name, move);
    }
}
