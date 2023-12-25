import Enum.*;
import Interface.*;
import People.*;
import Locations.*;
import Exception.*;

public class Main{
    public static void main (String[] args) {
        Luice luice = new Luice("Луис", "доктор");
        Joan joan = new Joan("Джоан Чарлтон", "медсестра", 50, "седая");
        Transport car = new Transport(false, "машина");
        University university = new University("университет");
        Motorbiker motorbiker = new Motorbiker("мотоциклист");
        Transport ambulance_car = new Transport(true, "скорая помощь");
        Hospital hospital = new Hospital("лазарет");
        Patient patient = new Patient("пациент");
        Doctor doctor = new Doctor("Доктор");
        Stiv stiv = new Stiv("Стив Мастертон", "помощник доктора");
        Patient girl = new Patient("девушка");
        int number = (int)(Math.random() * 24 + 1);
        CarPark.ParkingPlace parkingPlace = new CarPark.ParkingPlace(number, "место");



        Temperature high = new Temperature() {
            final double highThermometer =(double)(Math.random()*7.0 + 35.0);
            double valueGrowthThermometer = 35.0;
            @Override
            public void takeOffTemperature(String name, String move) {
                if (highThermometer >= 36.0 && highThermometer <= 37.5){
                    System.out.printf("%s is healthy.\n", patient);
                }
                else if (highThermometer < 36.0) {
                    System.out.printf("Низкая температура тела - %s %s.\n", move, name);
                }
                else if (highThermometer > 37.5){
                    System.out.printf("Высокая температура тела - %s %s.\n", move, name);
                }
            }
            @Override
            public void takeTemperature() {
                for (valueGrowthThermometer = 35.0; valueGrowthThermometer <= highThermometer; valueGrowthThermometer ++){
                    if (valueGrowthThermometer == highThermometer){
                        System.out.println("Температура измерена.");
                    }
                    System.out.printf("Измерение температуры: %.1f...\n", valueGrowthThermometer);
                }
                System.out.printf("Температура: %.1f.\n", valueGrowthThermometer);
            }
        };


        luice.drive(car, "ехал", university);
        luice.see(View.MOVEMENT, "увидел");
        luice.see(View.TRANSPORT, "увидел");
        luice.slowDown("затормозил", car, "пропустил", motorbiker);

        int overandom = (int) (Math.random() * 2);
        try{motorbiker.overtake(overandom);}
        catch (MotorbikerException ex){
            System.out.println(ex.getMessage());
        }
        boolean stateFell = motorbiker.getOvertake();

        luice.feeling(stateFell);
        luice.see(View.MOTORBIKER, "не обратил внимание на");
        luice.see(View.AMBULANCE_CAR, "не увидел");
        luice.feeling2(View.AMBULANCE_CAR);
        luice.enter(hospital, "зашел");
        if (Hospital.Ward.getCount() == 2) {
            System.out.println("В госпитале есть две палаты.");
        }
        hospital.ward.ward();
        hospital.ward2.ward();
        if (hospital.operatingRoom.getReal()) {
            System.out.println("В госпитале отсутсвует операционная.");
        }

        int randomhealthy = (int) (Math.random() * 2);
        try {patient.ill(randomhealthy);}
        catch (HealthyException ex){
            System.out.println(ex.getMessage());
        }
        boolean stateAmbulanceCar = patient.getIll();
        doctor.ambulanceDeliver(stateAmbulanceCar, ambulance_car, "доставил", hospital);
        stiv.demonstrate("показывал", hospital);
        stiv.talk("посвятил");
        stiv.feeling3(Feel.PRIDE, "Чувствуя", "рассказал");
        for (int i = 0; i < 38; i++) {
            ambulance_car.ambulanceDrive(ambulance_car, "выехала");
        }
        System.out.printf("%s выехала на выезд %d раз.\n", ambulance_car, ambulance_car.getCount_drive());
        luice.see(TypeDay.FIRSTDAY, View.AMBULANCE_CAR, "не увидел");
        luice.parking("Место доктора Крида", "припарковал", car, parkingPlace, number);
        luice.enter(hospital, "поспешил");
        luice.see("застал");
        high.takeTemperature();
        high.takeOffTemperature("Джоан Чарлтон", "сказала");
        girl.relax("обгорела", TypeDay.SUNNY, "хорошо");
        luice.say(Replicas.HELLO, "сказал");
        luice.say(Replicas.CAR);
        joan.say(Replicas.DRAMA, "сказала");
        stiv.see(View.PUDDLE, "увидел");
        stiv.say(Replicas.RADIATOR, "сказал");
        luice.say(Replicas.REGRET, Feel.REGRET, "сказал");
        luice.say(Replicas.WHEN);
        joan.lauth("засмеялась");

    }
}