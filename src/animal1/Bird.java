package animal1;

import java.util.Objects;

public abstract class Bird extends Animal {
    private String environment;

    public abstract void pasture();

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return environment.equals(bird.environment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), environment);
    }

    public Bird(String name, int age, String type, String environment) {
        super(name, age, type);
        this.environment = environment;
    }

    public boolean equals(String name, int age, String environment) {
        if (super.equals(name, age) && this.environment.equalsIgnoreCase(environment)) {
            return true;
        }
        return false;
    }
}
