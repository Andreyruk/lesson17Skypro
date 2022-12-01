package animal1;

import java.util.Objects;

public class Herbivores extends Mammal {
    private static int countId;
    private String typeFood;
    private int id;

    @Override
    public void eat() {
        System.out.println("ест траву");
    }

    @Override
    public void move() {
        System.out.println("быстро бегает");
    }

    @Override
    public void walk() {
        System.out.println("гуляет");
    }

    public void pasture() {
        System.out.println("пасется");
    }

    public String getTypeFood() {
        return typeFood;
    }

    public void setTypeFood(String typeFood) {
        this.typeFood = typeFood;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(typeFood, that.typeFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeFood);
    }

    public Herbivores(String name, int age, String type, String environment, Double speed, String typeFood) {
        super(name, age, type, environment, speed);
        this.typeFood = typeFood;
        countId++;
        this.id = countId;
    }

    public boolean equals(String name, int age, String environment, Double speed, String typeFood) {
        if (super.equals(name, age, environment, speed) && this.typeFood.equalsIgnoreCase(typeFood)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Herbivores{" + id + " - " +
                "typeFood='" + typeFood + '\'' +
                ", environment='" + getEnvironment() + '\'' +
                ", speed=" + getSpeed() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", type='" + getType() + '\'' +
                '}';
    }
}