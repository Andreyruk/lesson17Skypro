import animal1.Animal;
import animal1.Herbivores;
import transport.Bus;
import transport.Car;
import transport.Train;

import java.time.LocalDate;

public class MainTransport {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 17.");
        car();
        trains();
        bus();
//        animal();
    }

    private static Car[] auto;

    public static void car() {
        auto = new Car[5];
        auto[0] = new Car("Lada", "Granta", null/*или 0 и меньше*/, -1.7, "   "/*"жёлтый"*/, "Россия", "механика", "",
                "х123хв456", 5, "зимняя", "Удаленный запуск", "Бесключевой доступ", LocalDate.of(2030, 5, 4), 20, "5rty48er934gh", 100.0, 59.49, "дизель");
        auto[1] = new Car("Audi", "A8 50 L TDI quattro", 2020, 3.0, "чёрный", "Германия", "", "",
                "а123са456", 4, "зимняя", "", "", LocalDate.of(2010, 5, 4), 20, "512346987", 100.0, 59.49, "");
//        auto[2] = new transport.Car("BMW", "Z8", 2021, 3, "чёрный", "Германия");
        auto[3] = new Car("Kia", "Sportage 4-го поколения", 2018, 2.4, "красный", "Южная Корея", "", "",
                "а123ек456", -6, "зимняя", "", "", LocalDate.of(2010, 5, 4), 20, "5", -100.0, 59.49, "");
        auto[4] = new Car("Hyundai", "Avante", 2016, -1.6, "оранжевый", ""/*"Южная Корея"*/, "", "",
                "в123ро456", 5, "летняя", "", "", LocalDate.of(2010, 5, 4), 20, "5", 100.0, -59.49, "");
        auto[4].setRegistrationNumber("s123g#456");
        infoCar();
        System.out.println();
    }

    public static void infoCar() {
//        for (int i = 0; i < auto.length; i++) {
//            if (auto[i] != null)
//        System.out.println(auto[i]);
//        или так
        for (Car auto : auto) {
            if (auto != null) {
                System.out.println(auto);
                System.out.println(auto.getKey());
                System.out.println(auto.getInsurance());
                auto.refill();
            }
        }
    }

    private static Train[] trains;

    public static void trains() {
        trains = new Train[2];
        trains[0] = new Train("Ласточка", "В-901", 2011, 301.0, 3500.0,
                "Белорусский вокзал", "Минск-Пассажирский", 11, 301.0, "дизель");
        trains[1] = new Train("Ленинград", "В-901", 2011, 301.0, 3500.0,
                "Белорусский вокзал", /*"Минск-Пассажирский"*/"", 11, 301.0, "");
        infoTrain();
        System.out.println();
    }

    public static void infoTrain() {
        for (Train trains : trains) {
            if (trains != null) {
                System.out.println(trains);
                trains.refill();
            }
        }
    }

    private static Bus[] bus;

    public static void bus() {
        bus = new Bus[2];
        bus[0] = new Bus(/*"Ласточка"*/"", "В-901", 2011, 301.0, "Минск-Пассажирский",
                "Белорусский вокзал", 150.0, "дизель");
        bus[1] = new Bus("Ленинград", /*"В-901"*/"", 2011, 301.0, /*"Минск-Пассажирский"*/"",
                "Белорусский вокзал", 120.0, "");
        infoBus();
    }

    public static void infoBus() {
        for (Bus bus : bus) {
            if (bus != null) {
                System.out.println(bus);
                bus.refill();
            }
        }
    }
//private static Herbivores[] animals;
//    public static void animal() {
//        animals = new Herbivores[3];
//        animals[0] = new Herbivores("газель", 5, "лес", 61.5, "трава");
//        animals[1] = new Herbivores("жираф", 5, "лес", 61.5, "трава");
//        animals[2] = new Herbivores("лошадь", 5, "лес", 61.5, "трава");
//        infoAnimal();
//    }
//    public static void infoAnimal() {
//        for (Animal animals : animals) {
//            if (animals != null) {
//                System.out.println(animals);
////                animal.refill();
//            }
//        }
//    }
}