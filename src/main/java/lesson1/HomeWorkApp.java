package lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        run(args);
    }
    public static void printThreeWords() {
        System.out.println("Orange"); // вывод первого слова
        System.out.println("Banana"); // вывод второго слова
        System.out.println("Apple"); // вывод третьего слова
    }
    public static void run (String[] args) {
        checkSumSign();
    }
    public static void checkSumSign() {
        int a = 5;
        int b = 6;
        int sum = a + b;

        if (sum >= 0){
            System.out.println("Сумма положительная");
        }
        else
            System.out.println("Сумма отридцательная");
    }
}

