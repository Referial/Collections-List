import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        int x = 0;


        while (x == 0) {
            System.out.println("Выберите одну из операций: \n" + "1. Добавить \n" +
                    "2. Показать \n" + "3. Удалить \n" + "4. Найти \n" + "5. Выйти из программы \n");

            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Какую покупку хотите добавить?");

                    list.add(scanner.next());

                    System.out.println("Итого в списке покупок: " + list.size());
                    break;
                case 2:
                    System.out.println("Список покупок:");

                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i + 1) + ". " + list.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Список покупок:");

                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i + 1) + ". " + list.get(i));
                    }

                    System.out.println("Какую хотите удалить? Введите номер или название");

                    String k = scanner.next();
                    String name = null;

                    try {
                        int t = Integer.parseInt(k) - 1;
                        name = list.get(t);
                        list.remove(t);
                    } catch (NumberFormatException exception) {
                        name = k;
                        list.remove(k);
                    }

                    System.out.println("Покупка \"" + name + "\" удалена, список покупок:");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i + 1) + ". " + list.get(i));
                    }
                    break;
                case 4:
                    System.out.println("Введите текст для поиска:");

                    String queryLower = scanner.next();
                    queryLower = queryLower.toLowerCase();

                    System.out.println("Найдено:");

                    for (String s : list) {
                        String itemLower = s.toLowerCase();
                        if (itemLower.contains(queryLower)) {
                            System.out.println((list.indexOf(s) + 1) + ". " + s);
                        }
                    }
                    break;
                case 5:
                    x++;
                    break;
                default:
                    System.out.println("Некоректный ввод.");
                    break;
            }
        }
    }
}