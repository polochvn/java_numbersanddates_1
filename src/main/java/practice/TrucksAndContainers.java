package practice;

import java.util.Scanner;

public class TrucksAndContainers {

    private final static int MAX_BOXES = 27;
    private final static int MAX_CONTAINER = 12;



    public static String newLine = System.lineSeparator();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //получение количество коробок от пользователя
        int boxes = scanner.nextInt();
        int truck = 1;
        int container = 1;

        if (boxes <= 0) {
            truck = 0;
            container = 0;
            System.out.println("Необходимо:" + newLine + "грузовиков - " + truck +
                    " шт." + newLine + "контейнеров - " + container + " шт.");
        } else if (boxes > 0) {
            System.out.println("Грузовик: " + truck + newLine + "\t" + "Контейнер: " + container);
            for (int i = 1; i <= boxes; i++) {
                System.out.println("\t\tЯщик: " + i);
                if (i % (MAX_BOXES * MAX_CONTAINER) == 0 && i != boxes) {
                    truck++;
                    System.out.println("Грузовик: " + truck);
                }
                if (i % MAX_BOXES == 0 && i != boxes) {
                    container++;
                    System.out.println("\tКонтейнер: " + container);
                }

            }
            System.out.println("Необходимо:" + newLine + "грузовиков - " + truck +
                    " шт." + newLine + "контейнеров - " + container + " шт.");
        }


        // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
        // пример вывода при вводе 2
        // для отступа используйте табуляцию - \t

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */
    }

}
