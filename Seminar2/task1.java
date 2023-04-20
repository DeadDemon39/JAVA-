package Seminar2;

import java.util.Scanner;

/**
 * task1
 */
public class task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = inputNumber(scanner);
        System.out.println(a);
        
    }
    private static int inputNumber (Scanner scanner) { // ТАКИМ ОБРАЗОМ СОЗДАЕТЬСЯ ФУНКЦИЯ
        while (true) {
            try {
                String line = scanner.nextLine ();
                return Integer.parseInt(line);
            }
            catch (Exception ex) {
                System.out.println("Ошибка ввода:!!");
            }
            finally {
                // сдать в систему ресурсы, если вы их брали 
                // файлы       
            }
        }
    }
}