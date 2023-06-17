package Seminar3;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/*
 * Создать класс Собака и Кот с наследованиес от класса Животное.
 * Все животные могут бежать и плыть. В качестве параметра каждому методу передается длинна препятствия.
 * Результатом выполнения действия будет печать в консоль. (Например, dog1.run(150); -> 'Бобик пробежал 150 м.');
 * У каждого животного есть ограничения на действия
 * (бег: кот 200м., собака 500 м.; плавание: кот не умеет плавать, собака 10м.).
 * Добавить подсчет созданных котов, собак и животных.
 */

public class Program {

    public static void main(String[] args) {
        
        Cat cat1 = new Cat("Барсик");
        System.out.println(cat1.getId());
        cat1.run(10);

        Cat cat2 = new Cat("Персик");
        System.out.println(cat2.getId());
        
        cat2.swim(20);

        Cat cat3 = new Cat("Бублик");
        System.out.println(cat3.getId());
        cat3.run(300);


        Dog dog1 = new Dog("Бобик");


        Dog dog2 = new Dog("Шарик");


        System.out.println("Всего " + Cat.getCatCounter() + " икотов");

        

    }
    
}


    
