public class HW_2_Main_Extra {
    public static void main(String[] args) {
//        Необходимо создать целочисленные переменные a и b,
//        присвоить произвольные значения переменным на ваш выбор
//        и вывести результаты следующих операций с этими переменными:
//        сложение, умножение, вычитание, деление и остаток от деления.
//        Так же сделать проверку на четность этих переменных и вывести результат.
//        Экстра задача
//        Вывести/напечатать смайлик (не :), а настоящий смайлик одним символом).
        int a = 99;
        var b = 3;

        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a % b);

        if (a % 2 == 0) System.out.println("The variable 'a' is Even");
        else System.out.println("The variable 'a' is Odd");
        if (b % 2 == 0) System.out.println("The variable 'b' is Even");
        else System.out.println("The variable 'b' is Odd");

        System.out.println("\uD83D\uDE00");
    }
}
