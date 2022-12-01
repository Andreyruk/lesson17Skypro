package animal1;

import java.util.Objects;

public class Flightless extends Bird {

    private static int countId;
    private String typeMovement;
    private int id;

    @Override
    public void eat() {
        System.out.println("ест мясо");
    }

    @Override
    public void move() {
        System.out.println("передвигается");
    }

    @Override
    public void pasture() {
        System.out.println("охотится");
    }

    public void walk() {
        System.out.println("гуляет");
    }

    public String getTypeMovement() {
        return typeMovement;
    }

    public void setTypeMovement(String typeMovement) {
        this.typeMovement = typeMovement;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return id == that.id && typeMovement.equals(that.typeMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeMovement, id);
    }

    public Flightless(String name, int age, String type, String environment, String typeMovement) {
        super(name, age, type, environment);
        this.typeMovement = typeMovement;
        countId++;
        this.id = countId;
    }

    public boolean equals(String name, int age, String environment, String typeFood) {
        if (super.equals(name, age, environment) && this.typeMovement.equalsIgnoreCase(typeMovement)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Flightless{" + id + " - " +
                "typeMovement='" + typeMovement + '\'' +
                ", environment='" + getEnvironment() + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", type='" + getType() + '\'' +
                '}';
    }
}
