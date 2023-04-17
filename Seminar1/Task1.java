package Seminar1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*; // ИМПОРТИРУЕТ ВСЕ КЛАССЫ ИЗ ЭТОГО ПАКЕТА!!!


public class Task1 {
  
    
    public static void main(String[] args) {
        
        System.out.println("Hello, World!");

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formattter = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss");
        System.out.println(formattter.format(now));
    }
}
