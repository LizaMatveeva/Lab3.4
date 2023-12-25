package Enum;

public enum View {
    MOVEMENT ("оживленное движение"),
    TRANSPORT ("машины, велосипеды, мотоциклы"),
    MOTORBIKER ("мотоциклист"),
    AMBULANCE_CAR ("скорая помощь"),
    PUDDLE ("громадная лужа под машиной");
    private String view;
    View (String view){
        this.view = view;
    }
    public String toString(){
        return view;
    }
}
