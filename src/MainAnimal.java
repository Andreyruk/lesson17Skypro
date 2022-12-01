import animal1.*;

import java.util.ArrayList;
import java.util.List;

public class MainAnimal {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 17.");
        ArrayList<Herbivores> zoo = new ArrayList<>();
        addAnimal(zoo, new Herbivores("Роза", 7, "Газель", "Саванна", 50.0, "трава"));
        addAnimal(zoo, new Herbivores("Роза1", 5, "Жираф", "Саванна", 50.0, "трава"));
        addAnimal(zoo, new Herbivores("Роза2", 3, "Лошадь", "Степь", 50.0, "трава"));
        addAnimal(zoo, new Herbivores("Роза", 7, "Газель", "Саванна", 50.0, "трава"));
        addAnimal(zoo, new Herbivores("Роза5", 2, "Жираф", "Саванна", 50.0, "трава"));
        zoo.forEach(herbivores -> {
            System.out.println(herbivores);
            herbivores.eat();
            herbivores.sleep();
            herbivores.walk();
            herbivores.pasture();
        });
        System.out.println();

        ArrayList<Carnivore> zoo1 = new ArrayList<>();
        addAnimal(zoo1, new Carnivore("Роза", 5, "Гиена", "Саванна", 50.0, "мясо"));
        addAnimal(zoo1, new Carnivore("Роза1", 3, "Тигр", "Тайга", 50.0, "мясо"));
        addAnimal(zoo1, new Carnivore("Роза", 5, "Гиена", "Саванна", 50.0, "мясо"));
        addAnimal(zoo1, new Carnivore("Роза2", 6, "Медведь", "Тайга", 50.0, "мясо"));
        zoo1.forEach(carnivore -> {
            System.out.println(carnivore);
            carnivore.eat();
            carnivore.move();
            carnivore.sleep();
            carnivore.walk();
            carnivore.pasture();
        });
        System.out.println();

        ArrayList<Amphibian> zoo2 = new ArrayList<>();
        addAnimal(zoo2, new Amphibian("Роза", 5, "Лягушка", "Саванна"));
        addAnimal(zoo2, new Amphibian("Роза1", 5, "Уж", "Саванна"));
        zoo2.forEach(amphibian -> {
            System.out.println(amphibian);
            amphibian.eat();
            amphibian.move();
            amphibian.sleep();
            amphibian.pasture();
        });
        System.out.println();

        ArrayList<Flightless> zoo3 = new ArrayList<>();
        addAnimal(zoo3, new Flightless("Роза", 4, "Павлин", "Саванна", "ходит"));
        addAnimal(zoo3, new Flightless("Роза1", 5, "Пингвин", "Арктика", "ходит"));
        addAnimal(zoo3, new Flightless("Роза2", 3, "Додо", "Тайга", "ходит"));
        zoo3.forEach(flightless -> {
            System.out.println(flightless);
            flightless.eat();
            flightless.move();
            flightless.sleep();
            flightless.pasture();
            flightless.walk();
        });
        System.out.println();

        ArrayList<Flying> zoo4 = new ArrayList<>();
        addAnimal(zoo4, new Flying("Роза", 4, "Чайка", "Река", "летает"));
        addAnimal(zoo4, new Flying("Роза1", 5, "Альбатрос", "Море", "летает"));
        addAnimal(zoo4, new Flying("Роза2", 3, "Сокол", "Лес", "летает"));
        zoo4.forEach(flying -> {
            System.out.println(flying);
            flying.eat();
            flying.move();
            flying.sleep();
            flying.pasture();
            flying.walk();
        });
        System.out.println();
    }

    public static <T> Boolean checkAnimals(T a1, T a2) {
        if (a1.equals(a2)) {
            System.out.println("это животное уже заведено");
            return false;
        }
//        if (((Animal) a1).getType().equalsIgnoreCase(((Animal) a2).getType())) {
//            System.out.println("такой тип животного уже заведен");
//            return true;
//        }
        return true;
    }

    public static <T> void addAnimal(List<T> zoo, T animal) {
        boolean checked = true;
        if (zoo.size() > 0) {
//            for (T t : zoo) {
//                if (t != null) {
//                    if (!checkAnimals(t, animal)) {
//                        checked = false;
//                        break;
//                    }
//                }
//            }
//            или
            for (int i = 0; i < zoo.size(); i++) {
                if (zoo.get(i) != null) {
                    if (!checkAnimals(zoo.get(i), animal)) {
                        checked = false;
                        break;
                    }
                }
            }
            if (checked) {
                zoo.add(animal);
            }
        } else {
            zoo.add(animal);
        }
    }
}