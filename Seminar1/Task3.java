/*
 * Задание N1+
 * В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
 * -- "Доброе утро, "Имя"!", если время от 05:00 до 11:59
 * -- "Добрый день, "Имя"!", если время от 12:00 до 17:59
 * -- "Добрый вечер, "Имя"!", если время от 18:00 до 22:59
 * -- "Доброй ночи, "Имя"!", если время от 23:00 до 4:59
 */




package Seminar1;

import java.util.*;



import java.time.*;

public class Task3 {
    
    public static void main(String[] args) {

        System.out.println("Введите ваше имя: ");

        String name = new Scanner(System.in, "866").next();
        
        LocalTime timeNow = LocalTime.now();
        
            

        if (timeNow.getHour() >= 5 && timeNow.getHour() < 12) {
            System.out.println("Доброе утро, " + name);
        }

        if (timeNow.getHour() >= 12 && timeNow.getHour() < 18) {
            System.out.println("Добрый день, " + name);
        }

        if (timeNow.getHour() >= 18 && timeNow.getHour() < 23) {
            System.out.println("Добрый вечер, " + name);
        }
       
        if (timeNow.getHour() >= 23) {
            System.out.println("Доброй ночи, " + name);
        }   
        if (timeNow.getHour() < 5) {
            System.out.println("Доброй ночи, " + name);
        }        
        
         
    }

}
