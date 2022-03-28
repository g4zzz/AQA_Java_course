public class HW_5_2_pyramids {
    public static void main(String[] args) {
////        Задача №1
//        int number = 9;
//        for (int i = number; i >= 0; i--) { //цикл для уровней пирамиды начиная с 9 и на уменьшение до 0
//
//            for (int j = 0; j <= i; j++ ) { //цикл для заполнения уровней пирамиды от 0 до i
//                System.out.print(j + " "); //печатаем значения j от 0 до i с пробелом в одну строку
//            }
//            System.out.println(); //переход на следующий уровень пирамиды
//        }
//
////          Задача №2
//        for (int a = 0; a <= number; a++) { //Prints i spaces at the beginning of each row
//            for (int b = 0; b < a; b++) {
//                System.out.print("  ");
//            }
//            for (int b = 0; b <= (number-a); b++) { //Prints i to rows value at the end of each row
//                System.out.print(b + " ");
//            }
//            System.out.println();
//        }
//        Задача №3

        for (int i = 9; i >= 0; i--) { //Prints i spaces at the beginning of each row
            for (int j = i; j < 9; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 0; j--) { //Prints i to rows value at the end of each row
                System.out.print(j + " ");
            }
            for (int j = 1; j <= i; j++ ) { //цикл для заполнения уровней пирамиды от 0 до i
                System.out.print(j); //печатаем значения j от 0 до i с пробелом в одну строку
                System.out.print(" ");
            }
            System.out.println();

            }


        }

    }

