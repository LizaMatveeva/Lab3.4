package Enum;

public enum Replicas {
    HELLO ("Доброе утро"),
    DRAMA ("О, у нас тут настоящая трагедия" ),
    REGRET ("Жаль"),
    CAR ("Где машина?"),
    RADIATOR ("Радиатор полетел"),
    WHEN ("Когда мы получим ее обратно?");
    private String replica;

    Replicas(String replica) {
        this.replica = replica;}

    public String toString() {
        return replica;}
}
