package Enum;

public enum Feel{
    IRRITATION ("раздражение"),
    ALERTNESS ("напряжение"),
    REGRET ("сожаление"),
    PRIDE ("гордость");
    private String type;
    Feel (String type){
        this.type = type;
    }
    public String toString (){
        return type;
    }
}