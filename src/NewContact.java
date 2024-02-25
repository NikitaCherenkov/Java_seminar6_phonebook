import java.util.ArrayList;

public class NewContact {
    public static void Create(Phonebook pb, String name, String number) {
        if (pb.contacts.containsKey(name)) {
            ArrayList<String> existsNumbers = pb.contacts.get(name);
            existsNumbers.add(number);
            pb.contacts.remove(name);
            Phonebook newPb = new Phonebook();
            for (String key:pb.contacts.keySet()) {
                if (pb.contacts.get(key).size() < existsNumbers.size()) {
                    newPb.contacts.put(name, existsNumbers);
                }
                newPb.contacts.put(key, pb.contacts.get(key));
            }
            if (!newPb.contacts.containsKey(name)) newPb.contacts.put(name, existsNumbers);
            pb.contacts = newPb.contacts;
        }
        else {
            pb.contacts.put(name, new ArrayList<String>());
            pb.contacts.get(name).add(number);
        }
    }
}
