
import java.util.*;

public class HW_4_1_2D_arrays {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //        сумма всех элементов массива
        System.out.println(Arrays.stream(array).sum());
//        //другой рабочий способ
//        int i;
//        int sum = 0;
//        for (i = 0; i < array.length; i++) {
//            sum = sum + array[i];
//        }
//        System.out.println(sum);

        //        вывод макс значения из элементов массива
        System.out.println(Arrays.stream(array).max());
//        //другой рабочий способ
//        int max = array[0];
//        int i;
//        for (i = 0; i < array.length; i++) {
//            if (max < array[i]) {
//                max = array[i];
//            }
//        }
//        System.out.println(max);
//    }
//}

        //        вывод мин значения из элементов массива
        System.out.println(Arrays.stream(array).min());
//        //другой рабочий способ
//        int min = array [0];
//        for (int i = 0; i < array.length; i++) {
//            if (min > array[i]) {
//                min = array[i];
//            }
//        }
//        System.out.println(min);
//    }
//}
        //        вывод среднего значения элементов массива
        System.out.println(Arrays.stream(array).average());
//        //другой рабочий способ
//        double avv = 0;
//        int summ = 0;
//        for (int i =0; i < array.length; i++){
//            summ = summ + array[i];
//        }
//        avv = summ / array.length;
//        System.out.println(avv);
//    }
//}
        //        сумма всех элементов 2D массива
        int result = 0;
        int[][] array2x = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9},
                {-1, -2, -3, -4},
                {-5, -6}};
        for (int i = 0; i < array2x.length; i = i + 1) {
            for (int j = 0; j < array2x[i].length; j = j + 1) {
                result = result + array2x[i][j];
            }
        }
        System.out.println("summ is " + result);


//        максимальное значение 2D массива
        int max2x = Integer.MIN_VALUE;
        for (int i = 0; i < array2x.length; i++) {
            for (int j = 0; j < array2x[i].length; j++) {
                if (array2x[i][j] > max2x) {
                    max2x = array2x[i][j];
                }
            }
        }
        System.out.println("Maximum value of 2D array is " + max2x);


//            //        вывод количество элементов 2D массива
        int count = 0;
        for (int i = 0; i < array2x.length; i++) {
            count = count + array2x[i].length;
        }
        System.out.println(count);
    }
}
