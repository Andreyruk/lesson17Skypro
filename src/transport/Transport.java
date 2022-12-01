package transport;

import static valid.ValidateUtils.*;

public abstract class Transport {
    public final static String DEFAULT_MESSAGE = "default";
    private String brand;
    private String model;
    private final Integer year;
    private final String country;
    private String color;
    private Double maxSpeed;
    protected Double fuelPercentage;
    private String fuelType;

    public Transport(String brand, String model, Integer year, String country, String color, Double fuelPercentage, Double maxSpeed, String fuelType) {
        this.brand = validateString(brand, DEFAULT_MESSAGE);
        this.model = validateString(model, DEFAULT_MESSAGE);
        this.year = validateYear(year);
        this.country = validateString(country, DEFAULT_MESSAGE);
        this.color = validateColor(color);
        this.maxSpeed = validateYearAndNumber(maxSpeed).doubleValue();
        this.fuelPercentage = validateYearAndNumber(fuelPercentage).doubleValue();
        this.fuelType = fuelType;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public Double getMaxSpeed() {
        return maxSpeed;
    }

    public Double getFuelPercentage() {
        return fuelPercentage;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(Double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getFuelType() {
        return fuelType;
    }
    public abstract void refill();
}