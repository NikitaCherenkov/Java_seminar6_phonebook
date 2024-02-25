import java.util.Scanner;

public class UI {
    private static Scanner scanner = new Scanner(System.in);
    public static void Main(Phonebook pb) {
        int input = 0;
        while (input != 3) {
            input = Request();
            if (input == 1) {
                Add(pb);
            } else if (input == 2) {
                PrintContacts(pb);
            }
        }
        scanner.close();
    }
    private static int Request() {
        System.out.println("1 - добавить новый номер\n" +
                "2 - вывести список номеров\n" +
                "3 - выход\n" +
                "Введите цифру, соответствующую нужному действию: ");
        while (!scanner.hasNextInt() && scanner.hasNext()) scanner.next();
        int input = scanner.nextInt();
        return input;
    }
    private static void Add(Phonebook pb) {
        System.out.println("Введите имя");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Введите номер");
        String number = scanner.nextLine();
        NewContact.Create(pb, name, number);
    }
    private static void PrintContacts(Phonebook pb) {
        StringBuilder sb = new StringBuilder();
        for (String key:pb.contacts.keySet()) {
            sb.append(String.format("%s (%d) => ", key, pb.contacts.get(key).size()));
            for (String s:pb.contacts.get(key)) {
                sb.append(String.format("\"%s\" ", s));
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
