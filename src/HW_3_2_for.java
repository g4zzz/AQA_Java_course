//        Задача №1
//        Необходимо вывести числа от 0 до 15.
//        Задача №2
//        Необходимо вывести все положительные степени числа 5 результат возведения которых меньше 10000,
//        вывести результат возведения в степень.
//        Задача №3
//        Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
//                Реализовать 2 варианта:
//        использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
//        без использования конструкции if (шаг цикла на ваше усмотрение).
public class HW_3_2_for {
    public static void main(String[] args) {
//        task 1
        for (int x = 0; x < 16; x = x + 1) {
            System.out.println(x);
        }
//        task 2
        int number = 5;
        int stepen = 1;
        int result = 1;

        for (; result < 10000; stepen++) {
            result = result * number;
            if(result < 10000){
                System.out.println("Степень числа равна =" + stepen + ";" + " Результат возведения =" + result);
            }
        }
        //другой рабочий вариант
//        for (; number < 10000; number = number * 5) {
//            System.out.println(number);
//            }
//        task 3
        for (int i = 40; i < 60; i++) {
            if (i % 4 == 0) {
                System.out.println("The numbers are even by 4..." + i);
            }
        }
        int z;
        for (z = 40; z >= 40 && z < 60; z = z + 4) {
            System.out.println("The numbers are even by 4..." + z);

        }

    }
}


