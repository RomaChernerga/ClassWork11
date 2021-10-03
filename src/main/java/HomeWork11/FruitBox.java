package HomeWork11;

import java.util.ArrayList;
import java.util.Arrays;

public class FruitBox <F extends Fruit>{  // наследуем от класса Aherns
    private ArrayList<F> fruits;  // задаем класс коробки с Фруктами - это лист..

    public FruitBox(ArrayList<F> fruits) {
        this.fruits = new ArrayList<>(fruits);
    }

    public FruitBox(F...fruits) {
            this.fruits = new ArrayList<>(Arrays.asList(fruits));
    }
    public ArrayList<F> getFruits() {
        return fruits;
    }

    public void add(F fruit){
        this.fruits.add(fruit);
    }
    public float getWeight() {  // метод для получения веса
        float weight = 0; //первоначальный вес = 0
        for(F fruit : fruits){ // проходимся по списку фруктов и считаем их колличество переназначая weight
           weight = weight + fruit.getWeight();
        }
        return weight;  // возвращаем обновленную массу
    }

    public boolean compare(FruitBox<?> another){ // метод сравнения
        if( (getWeight()) > another.getWeight()) {
            System.out.println("Первая сравнимая коробка потяжелее второй");
        } else if ((getWeight()) < another.getWeight()) {
            System.out.println("Вторая сравнивая коробка потяжелее первой");
        } else {
            System.out.println("Обе коробки одинаковы в весе");
        }
        return false;
    }


    public void transfer(FruitBox<? super F> another){ // метод пересыпания фруктов
        if(this == another) return;
        another.fruits.addAll(fruits);
        fruits.clear();

    }
}
