package transport;

import transport.Transport;
import valid.ValidateUtils;

import java.time.LocalDate;

import static valid.ValidateUtils.*;

public class Car extends Transport {
    @Override
    public void refill() {
        String fuel = ValidateUtils.validateString(getFuelType(), DEFAULT_MESSAGE);
        if (fuel.equalsIgnoreCase("бензин") || fuel.equalsIgnoreCase("дизель") || fuel.equalsIgnoreCase("электро")) {
            System.out.println(getFuelType());
        } else {
            System.out.println("тип топлива не соответствует автомобилям");
        }
    }

//    private final static String DEFAULT_MESSAGE = "default";

    private static class Key {
        private final String remoteStartEngine;
        private final String keylessAccess;

        public Key(String remoteStartEngine, String keylessAccess) {
            this.remoteStartEngine = validateString(remoteStartEngine, DEFAULT_MESSAGE);
            this.keylessAccess = validateString(keylessAccess, DEFAULT_MESSAGE);
        }

        public String getRemoteStartEngine() {
            return remoteStartEngine;
        }

        public String getKeylessAccess() {
            return keylessAccess;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteStartEngine='" + remoteStartEngine + '\'' +
                    ", keylessAccess='" + keylessAccess + '\'' +
                    '}';
        }
    }

    public class Insurance {
        private final LocalDate timeAction;
        private final double cost;
        private final String number;

        public Insurance(LocalDate timeAction, double cost, String number) {
            this.timeAction = timeAction;
            this.cost = validateYearAndNumber(cost).doubleValue();
            this.number = validateString(number, DEFAULT_MESSAGE);
        }

        public LocalDate getTimeAction() {
            return timeAction;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        @Override
        public String toString() {
//            boolean check = ValidateUtils.expirationDate(timeAction);
            return "Insurance{" +
                    "timeAction=" + (ValidateUtils.expirationDate(timeAction) ? timeAction.toString() : "Надо ехать менять страховку") +
                    ", cost=" + cost +
                    ", number=" + (number.length() != 9 ? "некорректный номер" : number) +
                    '}';
        }
    }

    //    private String brand;
//    private String model;
    private Double engineVolume;
    //    private String color;
//    private Integer year;
//    private String country;
    private String transmission;
    private String body;
    private String registrationNumber;
    private int numberPlaces;
    private String tyre;
    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, Integer year, Double engineVolume, String color, String country, String transmission,
               String body, String registrationNumber, int numberPlaces, String tyre, String remoteStartEngine, String keylessAccess,
               LocalDate timeAction, double cost, String number, Double fuelPercentage, Double maxSpeed, String fuelType) {
        super(brand, model, year, country, color, fuelPercentage, maxSpeed, fuelType);
//        this.brand = validateString(brand, DEFAULT_MESSAGE);
//        this.model = validateParameter(model);
        this.engineVolume = validateEngineVolume(engineVolume);
//        this.color = validateColor(color);
//        this.year = validateYear(year);
//        this.country = validateParameter(country);
        this.transmission = validateString(transmission, DEFAULT_MESSAGE);
        this.body = validateParameter(body);
        this.registrationNumber = registrationNumber;
        this.numberPlaces = validateYearAndNumber(numberPlaces).intValue();
        this.tyre = validateTyre(validateString(tyre, DEFAULT_MESSAGE));
        this.key = new Key(remoteStartEngine, keylessAccess);
        this.insurance = new Insurance(timeAction, cost, number);
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public Key getKey() {
        return key;
    }

//    public String getBrand() {
//        return brand;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public Integer getYear() {
//        return year;
//    }

    public Double getEngineVolume() {
        return engineVolume;
    }

//    public String getColor() {
//        return color;
//    }
//
//    public String getCountry() {
//        return country;
//    }

    public String getTransmission() {
        return transmission;
    }

    public String getBody() {
        return body;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberPlaces() {
        return numberPlaces;
    }

    public String getTyre() {
        return tyre;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = validateNumber(registrationNumber, DEFAULT_MESSAGE);
    }

    public void setTyre(String tyre) {
        this.tyre = tyre;
    }

    @Override
    public String toString() {
        return "Марка автомобиля: " + getBrand() + ", модель: " + getModel() + ", год выпуска: " +
                getYear() + ", объем двигателя: " + engineVolume + ", цвет кузова: " + getColor() +
                ", страна сборки: " + getCountry() + ", коробка передач: " + transmission +
                ", тип кузова: " + body + ", регистрационный номер: " + registrationNumber +
                ", количество мест: " + numberPlaces + ", резина: " + tyre + " " + fuelPercentage + " " + getMaxSpeed();
    }

    public static String validateParameter(String value) {
        return value == null || value.isBlank() || value.isEmpty() ? "no information" : value;
    }

    public static Double validateEngineVolume(Double value) {
        return value == null || value < 0 ? 1.5 : value;
//        return value < 0 ? Math.abs(value) : value;
    }

// метод перенесён в отдельный класс
    //public static int validateYear(int value) {
    //    return value <= 0 ? 2000 : value;
//    или
//    public static Integer validateNumber(Integer value) {
//        return value == null || value <= 0 ? 2000 : value;
//    }

    public static String validateTyre(String tyre) {
        LocalDate currentDate = LocalDate.now();

        if ((currentDate.getMonthValue() == 11 || currentDate.getMonthValue() == 12 || currentDate.getMonthValue() == 1 || currentDate.getMonthValue() == 2 || currentDate.getMonthValue() == 3) && tyre.equalsIgnoreCase("летняя")) {
            return "сменить резину на зимнюю";
        } else if ((currentDate.getMonthValue() == 4 || currentDate.getMonthValue() == 5 || currentDate.getMonthValue() == 6 || currentDate.getMonthValue() == 7 || currentDate.getMonthValue() == 8 || currentDate.getMonthValue() == 9 || currentDate.getMonthValue() == 10) && tyre.equalsIgnoreCase("зимняя")) {
            return "сменить резину на летнюю";
        } else {
            return tyre;
        }

    }
}