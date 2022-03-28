public class HW_4_2_str_arrays {
    public static void main(String[] args) {
//        вывести все буквы “о” из этой строки
        String s = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'о') {
                System.out.println(s.charAt(i));
            }
        }
//        подсчитать количество букв “е” в строке.
        String st = "Перевыборы выбранного президента";
        int count = 0;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == 'е') {
                count++;
            }
        }
        System.out.println("The amount e letters is " + count);

//    вывести индексы начала всех подстрок - “рит”, независимо от регистра.

        String str = "Посмотрите как Рите нравится ритм";
        str = str.toLowerCase();
        int index = str.indexOf("рит");
        while (index != -1) {
            System.out.println(index);
            index = str.indexOf("рит", index +1);
        }
//        подсчитать количество строк в массиве, которые не содержат буквы “е”
        String[][] array2x = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int count2x = 0;
        for (int i = 0; i < array2x.length; i++) {
            for (int j = 0; j < array2x[i].length; j++) {
                if (!array2x[i][j].contains("е")) {
                    count2x++;
                }
            }
        }
        System.out.println(count2x);


    }
}



