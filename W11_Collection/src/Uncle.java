import java.util.HashMap;
import java.util.Map;

class Uncle {
    private String name;
    private Map<Niece, String> presents = new HashMap<>(); // Map dari keponakan ke deskripsi hadiah

    public Uncle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPresent(Niece recipient, String description) {
        if (presents.containsValue(description)) {
            System.out.println("Present already given by this uncle to another niece.");
            return false;
        }
        presents.put(recipient, description);
        recipient.addPresent(name, description);
        return true;
    }

    public void listPresents() {
        System.out.println("Presents from Uncle " + name + ":");
        for (Map.Entry<Niece, String> entry : presents.entrySet()) {
            System.out.println("To " + entry.getKey().getName() + ": " + entry.getValue());
        }
    }
}