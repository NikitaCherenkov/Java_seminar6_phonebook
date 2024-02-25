public class Main {
    public static void main(String[] args) {
        Phonebook pb = Example();
        UI.Main(pb);
    }
    private static Phonebook Example() {
        Phonebook pb = new Phonebook();
        NewContact.Create(pb, "Ирина", "+7(948)577-20-83");
        NewContact.Create(pb, "Алексей", "8 971 824 65 35");
        NewContact.Create(pb, "Геннадий", "8 950 371-23-99");
        NewContact.Create(pb, "Иван", "+7(919)701-66-98");
        NewContact.Create(pb, "Ирина", "8 (973)655-74-90");
        NewContact.Create(pb, "Алексей", "+7964 159 68 57");
        NewContact.Create(pb, "Алексей", "+7 935 294-68-32");
        NewContact.Create(pb, "Геннадий", "89873320303");
        NewContact.Create(pb, "Ирина", "+7(942)696-08-73");
        NewContact.Create(pb, "Алексей", "8975 327 18 53");
        return pb;
    }
}
