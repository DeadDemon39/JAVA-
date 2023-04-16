// public class Lesson4 {
//     public static void main(String[] args) {
//         String s = "qwe";
//         int a = 123;
//         String q = s + a;
//         System.out.println(q);  
//     }
// }


/*
 * %d: целочисленных значений
 * %х: для вывода шестандцатеричных чисел
 * %f: для вывода чисел с плавающей точкой
 * %е: для вывода чисел в экспоненциальной форме, например, 3.1415е + 01
 * %с: для вывода одиночного символа
 * %s: для вывода строковых значений
 */




 public class Lesson4 {
        public static void main(String[] args) {
            
            float pi = 3.1415f;
            System.out.printf("%f\n", pi);  // 3,141500
            System.out.printf("%.2f\n", pi); // 3,14
            System.out.printf("%.3f\n", pi); // 3,141
            System.out.printf("%e\n", pi); // 3,141500e+00
            System.out.printf("%.2e\n", pi); // 3,14e+00
            System.out.printf("%.3e\n", pi); // 3,141e+00
    }    
 }