package animal1;

import java.util.Objects;

public abstract class Mammal extends Animal {
    private String environment;
    private Double speed;

    public abstract void walk();

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return Objects.equals(environment, mammal.environment) && Objects.equals(speed, mammal.speed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), environment, speed);
    }

    public Mammal(String name, int age, String type, String environment, Double speed) {
        super(name, age, type);
        this.environment = environment;
        this.speed = speed;
    }

    public boolean equals(String name, int age, String environment, Double speed) {
        if (super.equals(name, age) && this.environment.equalsIgnoreCase(environment) && this.speed == speed) {
            return true;
        }
        return false;
    }
}