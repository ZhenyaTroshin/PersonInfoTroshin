import java.util.Random;
import java.util.Scanner;
public class Person {
    public static void personInfoStatic(String name, String town, long number) {
        System.out.println("Зателефонувати громадянину " + name + " із міста " + town + " можна за номером: " + number);
    }
    public void personInfo(String name, String town, long number) {
        System.out.println("Зателефонувати громадянину " + name + " із міста " + town + " можна за номером: " + number);
    }

    public void personNew() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int id = random.nextInt(2312323);
        System.out.println("Введіть ім`я: ");
        String name = scanner.nextLine();
        System.out.println("Введіть фамілію: ");
        String surname = scanner.nextLine();
        System.out.println("Введіть місто проживання: ");
        String town = scanner.nextLine();
        System.out.println("Введіть ваш вік: ");
        int age = scanner.nextInt();
        if (age < 18) {
            System.out.println("Потрібен дозвіл батьків для реєстрації");
        } else {
            System.out.println("Введіть ваш дійсний номер: ");
            long number = scanner.nextLong();
            System.out.println("Нового користувача " + "\"" + name + " " + surname + "\"" + " зареєстровано");
            System.out.println("ID користувача: " + id);
            String fullName = name + " " + surname;
            personInfoStatic(fullName, town, number);
        }
    }

}
