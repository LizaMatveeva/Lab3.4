package Exception;

public class NoParkingException extends RuntimeException {
    public NoParkingException(String message){
        super(message);
    }
}
