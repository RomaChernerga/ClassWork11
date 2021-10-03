package HomeWork11;
/*1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
    2. Написать метод, который преобразует массив в ArrayList;
    3. Задача:
        a) Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
        b) Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
        c) Для хранения фруктов внутри коробки можно использовать ArrayList;
        d) Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
        вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
        e) Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той,
        которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
        Можно сравнивать коробки с яблоками и апельсинами;
        f) Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
        Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами. Соответственно,
        в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
        g) Не забываем про метод добавления фрукта в коробку.*/

import java.util.ArrayList;
import java.util.List;

public class HomeWork_11 {
    public static void main (String[]args){

       AboutMyFruits();
    }


    private static void AboutMyFruits() {
        FruitBox<Orange> orangeFruitBox = new FruitBox<>(new Orange(), new Orange(), new Orange());
        FruitBox<Apple> appleFruitBox = new FruitBox<>(new Apple(), new Apple(), new Apple());

        FruitBox<Apple> appleFruitBox2 = new FruitBox<>(new Apple()); // Новая коробка #2
        FruitBox<Apple> appleFruitBox3 = new FruitBox<>(new Apple(),new Apple(),new Apple(),new Apple(),new Apple()); // Новая коробка #3
        System.out.println("масса коробки №2 изначально: "+appleFruitBox2.getWeight());

        appleFruitBox3.transfer(appleFruitBox2);  // пересыпаем фрукты между коробками

        System.out.println("масса коробки №2 после обновления: "+ appleFruitBox2.getWeight());

        System.out.println(orangeFruitBox.compare(appleFruitBox));
        System.out.println(orangeFruitBox.getWeight());
        System.out.println(appleFruitBox.getWeight());
    }


    public static <A> ArrayList<A> arrayToList(A[] arr){
        ArrayList<A> result = new ArrayList<A>(arr.length);  // создаем array лист
        for(A a : arr){
            result.add(a);
        }
        return result;
    }







}
