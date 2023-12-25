package People;
import Enum.*;
import Exception.*;

public class Patient {
    String post;
    private boolean ill;
    public Patient(String post){
        this.post = post;
    }
    public void ill(int randomhealthy) throws HealthyException {
        if (randomhealthy == 0){
            this.ill = false;
            throw new HealthyException("Пациентка здорова");}
        else{
            this.ill = true;
            System.out.printf("%s %s.\n", post, Illness.SICK);
        }
    }
    public void relax(String move, TypeDay type, String emotion){
        System.out.printf("%s %s %s, когда был %s.\n", post, emotion, move, type);
    }
    public boolean getIll(){
        return ill;}

    public String toString(){
        return post;}
}