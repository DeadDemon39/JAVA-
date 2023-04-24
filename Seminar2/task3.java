/*
 * Дано четное число N (>0) и символы c1 и c2.
Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
 */


package Seminar2;

public class task3 {

    public static void main(String[] args) {
        int n = 10;
        char c1 = 'a';
        char c2 = 'b';
        
        System.out.println(ShowStr(n, c1, c2));
    }


    private static String ShowStr(int count, char c1, char c2) { // создали функцию 
        StringBuilder str = new StringBuilder(); // задали новую переменную строку

        for (int i = 0; i < count; i++) {
            if (i % 2 == 0) str.append(c1);
            else str.append(c2);
            
        }
        return str.toString(); // конвертировали в обычную строку
    }
    
    
}
