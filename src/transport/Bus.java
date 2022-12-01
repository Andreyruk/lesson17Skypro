package transport;

import valid.ValidateUtils;

import static valid.ValidateUtils.validateString;
import static valid.ValidateUtils.validateYearAndNumber;

public class Bus extends Transport {
//    private final static String DEFAULT_MESSAGE = "default";

    @Override
    public void refill() {
        String fuel = ValidateUtils.validateString(getFuelType(), DEFAULT_MESSAGE);
        if (fuel.equalsIgnoreCase("бензин") || fuel.equalsIgnoreCase("дизель")) {
            System.out.println(getFuelType());
        } else {
            System.out.println("тип топлива не соответствует автобусам");
        }
    }

    private Double priceTrip;
    private String stationDepartures;
    private String stationArrival;

    public Bus(String brand, String model, Integer year, /*String country, String color, Double fuelPercentage,*/
               Double priceTrip, String stationDepartures, String stationArrival, Double maxSpeed, String fuelType) {
        super(brand, model, year, null, null, null, maxSpeed, fuelType);
        this.priceTrip = validateYearAndNumber(priceTrip).doubleValue();
        this.stationDepartures = validateString(stationDepartures, DEFAULT_MESSAGE);
        this.stationArrival = validateString(stationDepartures, DEFAULT_MESSAGE);
    }

    public Double getPriceTrip() {
        return priceTrip;
    }

    public void setPriceTrip(Double priceTrip) {
        this.priceTrip = priceTrip;
    }

    public String getStationDepartures() {
        return stationDepartures;
    }

    public void setStationDepartures(String stationDepartures) {
        this.stationDepartures = stationDepartures;
    }

    public String getStationArrival() {
        return stationArrival;
    }

    public void setStationArrival(String stationArrival) {
        this.stationArrival = stationArrival;
    }

    @Override
    public String toString() {
        return "Bus{" + getBrand() + ", " + getModel() + ", " +
                "priceTrip=" + priceTrip +
                ", stationDepartures='" + stationDepartures + '\'' +
                ", stationArrival='" + stationArrival + '\'' +
                '}';
    }
}
