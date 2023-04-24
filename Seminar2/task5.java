package Seminar2;
/*
 * Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, 
 * который запишет эту строку в простой текстовый файл, обработайте исключения.
 */

import java.io.FileWriter;
import java.io.IOException;

import javax.xml.catalog.Catalog;

public class task5 {
    public static void main(String[] args) {
        
        String txt = "TEST";
        int repeat = 100;
        String result = strRepeat(txt, repeat);
        System.out.println(result);
        writeToFile(result);
    }


    private static String strRepeat(String txt, int count) {
        StringBuilder result = new StringBuilder();

        result.append(txt.repeat(count)); // Эквивалент умножени строк


        // for (int i = 0; i < count; i++) {
        //     result.append(txt);
        // }
        return result.toString();
    }

    private static void writeToFile(String text)  {

        try (FileWriter writer = new FileWriter("text.txt")) {
            writer.append(text);
            
        } catch (Exception ex) {
            System.out.println("Ошибка записи в файл!:");
        }   
        // FileWriter writer = null;
        // try {
        //     writer = new FileWriter("file.txt");
        //     writer.append(text);
        // } catch (IOException ex) {
        //     System.out.println("Ошибка записи в файл!");
        // }
        // finally {
        //     if (writer != null)
        //     try {
        //         writer.close();
        //     }
        //     catch (IOException ex) {
        //         System.out.println("Ошибка закрытия файла!");
                  
        //     }
            
        }
    }
    

