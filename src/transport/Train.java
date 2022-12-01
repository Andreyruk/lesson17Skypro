package transport;

import valid.ValidateUtils;

import static valid.ValidateUtils.validateString;
import static valid.ValidateUtils.validateYearAndNumber;

public class Train extends Transport {

    @Override
    public void refill() {
        String fuel = ValidateUtils.validateString(getFuelType(), DEFAULT_MESSAGE);
        if (fuel.equalsIgnoreCase("дизель")) {
            System.out.println(getFuelType());
        } else {
            System.out.println("тип топлива не соответствует поездам");
        }
    }

    private Double priceTrip;
    private Double timeTrip;
    private String stationDepartures;
    private String stationArrival;
    private Integer quantityVan;

    public Train(String brand, String model, Integer year, Double priceTrip, Double timeTrip, String stationDepartures,
                 String stationArrival, Integer quantityVan, Double maxSpeed, String fuelType) {
        super(brand, model, year, null, null, null, maxSpeed, fuelType);
        this.priceTrip = validateYearAndNumber(priceTrip).doubleValue();
        this.timeTrip = validateYearAndNumber(timeTrip).doubleValue();
        this.stationDepartures = validateString(stationDepartures, DEFAULT_MESSAGE);
        this.stationArrival = validateString(stationArrival, DEFAULT_MESSAGE);
        this.quantityVan = validateYearAndNumber(quantityVan).intValue();
    }

//    public Train(String brand, String model, Integer year, Double priceTrip, Double timeTrip, String stationDepartures,
//                 String stationArrival, Integer quantityVan, String country, String color, Double fuelPercentage, Double maxSpeed, String fuelType) {
//        super(brand, model, year, country, color, fuelPercentage, maxSpeed, fuelType);
//        this.priceTrip = priceTrip;
//        this.timeTrip = timeTrip;
//        this.stationDepartures = stationDepartures;
//        this.stationArrival = stationArrival;
//        this.quantityVan = quantityVan;
//    }


    public Double getPriceTrip() {
        return priceTrip;
    }

    public void setPriceTrip(Double priceTrip) {
        this.priceTrip = priceTrip;
    }

    public Double getTimeTrip() {
        return timeTrip;
    }

    public void setTimeTrip(Double timeTrip) {
        this.timeTrip = timeTrip;
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

    public Integer getQuantityVan() {
        return quantityVan;
    }

    public void setQuantityVan(Integer quantityVan) {
        this.quantityVan = quantityVan;
    }

    @Override
    public String toString() {
        return "Train{" + getBrand() + ", " + getModel() + ", " + getYear() + ", " +
                "priceTrip=" + priceTrip +
                ", timeTrip=" + timeTrip +
                ", stationDepartures='" + stationDepartures + '\'' +
                ", stationArrival='" + stationArrival + '\'' +
                ", quantityVan=" + quantityVan + ", " + getMaxSpeed() + ", " + getFuelType() +
                '}';
    }
}
