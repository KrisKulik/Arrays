import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }
    // Объявите три массива:
    // 1. Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.
    // 2. Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.
    // 3. Произвольный массив. Тип и количество данных определите сами.
    // Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.
    public static void task1() {
        System.out.println("Задача 1");
        int[] numbers = new int [3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        double[] fractionalNumbers = {1.57, 7.654, 9.986};
        System.out.println(fractionalNumbers [0]);
        System.out.println(fractionalNumbers [1]);
        System.out.println(fractionalNumbers [2]);

        int[] apple = {5, 25, 100};
        System.out.println(apple[0]);
        System.out.println(apple[1]);
        System.out.println(apple[2]);

    }

   // Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую.
   // В конце строки запятую ставить не надо.
    public static void task2() {
        System.out.println("Задача 2");
        int[] numbers = new int [3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.print(numbers[0] + ", ");
        System.out.print(numbers[1] + ", ");
        System.out.print(numbers[2]);

        System.out.println(" ");

        double[] fractionalNumbers = {1.57, 7.654, 9.986};
        System.out.print(fractionalNumbers [0] + ", ");
        System.out.print(fractionalNumbers [1] + ", ");
        System.out.print(fractionalNumbers [2]);

        System.out.println(" ");

        int[] apple = {5, 25, 100};
        System.out.print(apple[0] + ", ");
        System.out.print(apple[1] + ", ");
        System.out.println(apple[2]);
    }
    // Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую.
    // В конце строки запятую ставить не надо.
    public static void task3() {
        System.out.println("Задача 3");
        int[] numbers = new int [3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        System.out.print(numbers[2] + ", ");
        System.out.print(numbers[1] + ", ");
        System.out.print(numbers[0]);

        System.out.println(" ");

        double[] fractionalNumbers = {1.57, 7.654, 9.986};
        System.out.print(fractionalNumbers [2] + ", ");
        System.out.print(fractionalNumbers [1] + ", ");
        System.out.print(fractionalNumbers [0]);

        System.out.println(" ");

        int[] apple = {5, 25, 100};
        System.out.print(apple[2] + ", ");
        System.out.print(apple[1] + ", ");
        System.out.println(apple[0]);
    }
    // Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
    // Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания используйте циклы.
    // Распечатайте результат преобразования в консоль.
    public static void task4() {
        System.out.println("Задача 4");
        int[] number = {1, 2, 3};
        for (int i = 0; i < number.length; i++ ) {
        if (number[i] % 2 != 0) {
        number [i] += 1;
            }
        }
            {
            System.out.println(Arrays.toString(number));
        }
    }
}