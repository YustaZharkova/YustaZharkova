package lesson2;

public class SumTenTwenty {
    // статические поля класса
    static int a = 5;
    static int b = 6;
    // статический метод, который возвращает логическое значение
    public static boolean sumTenTwenty(int a, int b) {

        int sum = a + b;

        if (sum >= 10 && sum <= 20) {
            return true;
        }

        else {
            return false;
        }
    }

    // главный метод, который вызывает sumTenTwenty с аргументами a и b
    public static void main(String[] args) {
        System.out.println(sumTenTwenty(a, b));
    }
}


