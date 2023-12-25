package Locations;

import java.util.Objects;

public class Hospital extends Locations{
    public Ward ward = new Ward(15, 1);
    public Ward ward2 = new Ward(15, 2);
    @Override
    public int hashCode(){
        return Objects.hash(ward);
    }
    public Operating_room operatingRoom = new Operating_room(true);
    public Hospital(String name) {
        super(name);
    }

    public static class Ward {
        private final int bed = 15;
        private final int number;
        private static int count;
        public  Ward(int bed, int number){
            this.number = number;
            count += 1;
        }
        public static int getCount(){
            return count;
        }
        public int getBed(){
            return bed;
        }
        public void ward(){
            System.out.printf("В палате номер %d есть %d кроватей.\n", number, bed);
        }
    }
    public static class Operating_room {
        boolean real;
        public Operating_room(boolean real){
            this.real = real;
        }
        public boolean getReal(){
            return real;
        }
    }

}