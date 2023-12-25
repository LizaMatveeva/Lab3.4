package Enum;

public enum TypeDay {
    FIRSTDAY ("первый рабочий день"),
    SUNNY ("солнечный день");
    private String type;
    TypeDay (String type){
        this.type = type;
    }
    public String toString(){
        return type;
    }
}
