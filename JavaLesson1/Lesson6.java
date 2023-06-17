import javax.sound.sampled.SourceDataLine;

/**
 * УПРАВЛЯЮЩИЕ КОНСТРУКЦИИ: условный оператор
 */
public class Lesson6 {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;
        if (a > b) {
            c = a;
        }
        else {
            c = b;
        }
        System.out.println(c);
    }
}


// СОКРАЩЕННЫЙ ВАРИАНТ

int a = 1;
int b = 2;
int c = 0;
if (a > b) c = a;
if (b > a) c = b;

System.out.println(c);


/*
 * УПРАВЛЯЮЩИЕ КОНСТРУКЦИИ: ТЕРНАРНЫЙ ОПЕРАТОР
 */

 int a = 1;
 int b = 2;
 int min = a < b ? a : b;
 System.out.println(min);