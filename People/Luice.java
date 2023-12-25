package People;
import Enum.*;
import Interface.*;
import Locations.*;
import Exception.*;
public class Luice extends Human implements Drive {
    public Luice  (String name, String post){
        this.name = name;
        this.post = post;
    }
    public void feeling(boolean overtake){
        if (overtake){
            System.out.printf("%s чувствует %s.\n", name, Feel.IRRITATION);}
        else {
            System.out.printf("%s ничего не чувствует.\n", name);
        }
    }
    public void feeling2(View view){
        if (View.AMBULANCE_CAR == view){
            System.out.printf("%s чувствует %s.\n", name, Feel.ALERTNESS);}
    }
    @Override
    public void drive(Transport transport, String move, Locations locations) {
        System.out.printf("%s %s на %s в %s.\n ", name, move, transport, locations);
    }

    @Override
    public void slowDown(String move, Transport transport, String move2, Motorbiker motorbiker) {
        System.out.printf("%s %s %s и %s %s.\n", name, move, transport, move2, motorbiker);
    }
    @Override
    public void say(Replicas replica, String move) {
        System.out.printf("- %s, - %s %s.", replica, move, name);
    }
    public void say(Replicas replica){
        System.out.printf("- %s.\n", replica);
    }
    public void say(Replicas replica, Feel type, String move){
        System.out.printf("- %s, - %s %s без особого %s.", replica, move, name, type);
    }
    @Override
    public void see(View view, String move) {
        if (View.MOTORBIKER == view){
            System.out.printf("Мотоциклист помахал рукой, но %s %s %s.\n", name, move, view);}
        else if (View.AMBULANCE_CAR == view){
            System.out.printf("На стоянке лазарета %s %s %s.\n", name, move, view);
        }
        else {
            System.out.printf("%s %s %s.\n ", name, move, view);
        }
    }
    public void see(TypeDay type, View view, String move){
        System.out.printf("%s в свой %s %s %s.\n", name, type, move, view);
    }

    public void see(String move){
        System.out.printf("%s %s Джоан Чарлтон.\n", name, move);
    }
    public void enter(Hospital hospital, String move){
        System.out.printf("%s %s в %s.\n ", name, move, hospital);
    }
    public void parking(String phrase, String move, Transport transport, CarPark.ParkingPlace place, int number){
        if (phrase != "Место доктора Крида") throw new NoParkingException("нет места для парковки");
        else System.out.printf("%s %s %s на %s номер %s, где виднелась надпись: %s.\n", name, move, transport, place, number, phrase);
    }
}


