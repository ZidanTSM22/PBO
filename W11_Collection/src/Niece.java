import java.util.HashMap;
import java.util.Map;

class Niece {
    private String name;
    private int day;
    private int month;
    private Map<String, String> presents = new HashMap<>(); // Map dari nama paman ke deskripsi hadiah

    public Niece(String name, int day, int month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public int clearPresents() {
        int removed = presents.size();
        presents.clear();
        return removed;
    }

    public void addPresent(String uncleName, String description) {
        presents.put(uncleName, description);
    }

    public void listPresents() {
        System.out.println("Presents for " + name + ":");
        for (Map.Entry<String, String> entry : presents.entrySet()) {
            System.out.println("Uncle " + entry.getKey() + " will give: " + entry.getValue());
        }
    }
}