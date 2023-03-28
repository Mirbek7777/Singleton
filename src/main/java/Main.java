import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        Scanner scanner = new Scanner(System.in);

        logger.log("Запрашиваем исходные данные для программы");

        System.out.print("Введите размер списка:");
        int size = scanner.nextInt();

        System.out.print("Введите верхнюю границу значений:");
        int limitOfValue = scanner.nextInt();

        logger.log("Создаем и наполняем список");
        List<Integer> originalList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int value = random.nextInt(limitOfValue);
            originalList.add(value);
        }
        printList(originalList, "Случайный список:");

        System.out.print("Введите порог для фильтра:");
        int filterValue = scanner.nextInt();
        Filter filter = new Filter(filterValue);
        List<Integer> filterList = filter.filterOut(originalList);

        logger.log("Выводим результат на экран");
        printList(filterList, "Отфильтрованный список:");
        logger.log("Завершаем программу");
    }

    public static void printList(List<Integer> list, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer i : list) {
            stringBuilder.append(i + " ");
        }
        System.out.println(string + " " + stringBuilder.toString());
    }
}