// public class Lesson8 {
//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;

//         while (value != 0 ) {
//             value /= 10;
//             count ++;
//         }
//         System.out.println(count);    
//     }
// }

// ЭТО ЦИКЛ WHILE!!!!!!!!!!!!!!!!

/**
 * Lesson8
 */
// public class Lesson8 {
//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;

//         do {
//             value /= 10;
//             count++;
//         }
//         while (value != 0);
//         System.out.println(count);
//     }
// }


// ЭТО ЦИКЛ DO WHILE!!!!!!!!!

// ТЕПЕРЬ ЦИКЛ FOR!!!!!!!!!!!!


/**
 * Lesson8
 */
// public class Lesson8 {
//     public static void main(String[] args) {
//         for (int i = 0; i < 10; i++) {
//             System.out.println(i);
//         }
//     }
// }


public class Lesson8 {
     public static void main(String[] args) {

         for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
             System.out.println(i);
         }
     }
 }
    
