public class Main {

    public static void main(String[] args) {
     exerciseTwo();
     System.out.println("3: " + exerciseThree(5.9515951f, 5.9512695f, 5.33563346f, 5.5523523f));
     System.out.println("4: " + exerciseFour(10, 0));
     System.out.println("5: " + exerciseFive(-10));
     System.out.println("6: " + exerciseSix(-10));
     System.out.println("7: " + exerciseSeven("Павел"));
     System.out.println("8: " + exerciseEight(2400));
     }

//    Создать переменные всех пройденных типов данных и инициализировать их значения.

      public static void exerciseTwo() {
//   Целые числа
          byte b1 = 1;
          short s1 = 123;
          int i1 = 123456;
          long l1 = 123456789l;

          System.out.println(b1);
          System.out.println(s1);
          System.out.println(i1);
          System.out.println(l1);

//    Дробные числа
          float f1 = 2020.2021f;
          double d1 = 2020.2021d;
          System.out.println(f1);
          System.out.println(d1);

//	  Условие "Да", "Нет"
          boolean isYes = false;
          boolean isNo = true;
          System.out.println(isYes);
          System.out.println(isNo);

//    Один символ
          char c1 = '1';
          char c2 = 'C';
          System.out.println(c1);
          System.out.println(c2);
//    Значение char выводит символ
          System.out.println((char) (c1 + c2));
//    Без значения char выводит цифру
          System.out.println(c1 + c2);
      }

//    Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
//    где a, b, c, d – аргументы этого метода, имеющие тип float.

    public static float exerciseThree(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

//    Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
//    в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

    public static boolean exerciseFour(int a, int b) {
        return ((a + b) >= 10 && (a + b) <= 20);
    }

//    Написать метод, которому в качестве параметра передается целое число,
//    метод должен напечатать консоль, положительное ли число передали или отрицательное.
//    Замечание: ноль считаем положительным числом.

    public static String exerciseFive(int a) {
        if (a >= 0) {
        return a + " это положительное число"; }
        else {
        return a + " это отрицательное число";}
        }

//    Написать метод, которому в качестве параметра передается целое число.
//    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    public static boolean exerciseSix(int a) {
        if (a >= 0) {
            return true; }
        else {
            return false;}
    }

//    Написать метод, которому в качестве параметра передается строка, обозначающая имя.
//    Метод должен вывести в консоль сообщение «Привет, указанное_имя!».

     public static String exerciseSeven(String name) {
      return "Привет, " + name + "!"; }

//    !!Решение этого задания нашел в интернете так как испытывал тредности даже с предыдущими заданиями.
//    !!Было интересно как решается данное задание, из данного задания узнал что значит "деление по модулю".
//    Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
//    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

    public static String exerciseEight(int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) {
         return year + " г. не високосный"; }
        else {
         return year + " г. високосный"; }
    }
}
