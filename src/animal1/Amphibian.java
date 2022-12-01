package animal1;

import java.util.Objects;

public class Amphibian extends Animal {
    private static int countId;
    private String environment;
    //    private String typeFood;
    private int id;

    @Override
    public void eat() {
        System.out.println("ест насекомых");
    }

    @Override
    public void move() {
        System.out.println("передвигается");
    }

    public void pasture() {
        System.out.println("охотится");
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibian amphibian = (Amphibian) o;
        return id == amphibian.id && environment.equals(amphibian.environment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), environment, id);
    }

    public Amphibian(String name, int age, String type, String environment) {
        super(name, age, type);
        this.environment = environment;
        countId++;
        this.id = countId;
    }

    public boolean equals(String name, int age, String environment, Double speed, String typeFood) {
        if (super.equals(name, age) && this.environment.equalsIgnoreCase(environment)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Amphibian{" + id + " - " +
                "environment='" + environment + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", type='" + getType() + '\'' +
                '}';
    }
}
