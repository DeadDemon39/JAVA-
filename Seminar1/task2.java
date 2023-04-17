/* Написать программу, которая запросит пользователя ввести <Имя> в консоли.
Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
*/

package Seminar1;

import java.util.Scanner;

public class task2 {
    
    public static void main(String[] args) {

        System.out.println("Введите ваше Имя: ");
        
        String name = new Scanner(System.in, "866").next();  // 866 - ЭТО КОДИРОВКА ЧТО БЫ ПРОГРАММА РАСПОЗНАВАЛА КИРИЛИЦУ
        
        System.out.println("Привет, " + name);


        

    }
    
}
