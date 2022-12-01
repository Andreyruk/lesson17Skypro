package animal1;

import java.util.Objects;

public abstract class Animal {
    private String type;
    private String name;
    private int age;

    public abstract void eat();

    public void sleep() {
        System.out.println(type + " спит");
    }

    public abstract void move();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && type.equals(animal.type) && name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


    public boolean equals(String name, int age) {
        if (this.name.equalsIgnoreCase(name) && this.age == age) {
            return true;
        }
        return false;
    }

    public Animal(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }
}