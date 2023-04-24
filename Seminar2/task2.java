package Seminar2;

import java.io.FileReader;
import java.io.IOException;

public class task2 {
    public static void main(String[] args) {
        FileReader reader = null;
        try { // потенциально взврывоопасный код
            // основной успешный сценарий
            reader = new FileReader("file.txt"); // открыть файл
            int a = 5, b = 0;
            System.out.println(a / b);
        }
        catch (Exception ex) { // предназначена для того, что делать, если возникла ошибка
            System.out.println(ex); // рассказать об ошибке
            System.exit(0); // принудительно остановить программу
        }
        catch (IOException ex) {
            System.out.println("Была проблема!");
        }
        finally { // выполняется всегда, была ли ошибка или нет
            // вернуть ресурсы в систему: закрыть файл (если он открывался)
            if (reader != null)
                reader.close ();
        }
    }
    
}
