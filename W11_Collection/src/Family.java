import java.util.ArrayList;

class Family {
    private ArrayList<Uncle> uncles = new ArrayList<>();
    private ArrayList<Niece> nieces = new ArrayList<>();

    public boolean addUncle(String name) {
        for (Uncle uncle : uncles) {
            if (uncle.getName().equals(name)) {
                return false;
            }
        }
        uncles.add(new Uncle(name));
        return true;
    }

    public boolean addNiece(String name, int day, int month) {
        for (Niece niece : nieces) {
            if (niece.getName().equals(name)) {
                return false;
            }
        }
        nieces.add(new Niece(name, day, month));
        return true;
    }

    public Niece findNiece(String name) {
        for (Niece niece : nieces) {
            if (niece.getName().equals(name)) {
                return niece;
            }
        }
        return null;
    }

    public Uncle findUncle(String name) {
        for (Uncle uncle : uncles) {
            if (uncle.getName().equals(name)) {
                return uncle;
            }
        }
        return null;
    }

    public void listNieces() {
        System.out.println("List of nieces:");
        for (Niece niece : nieces) {
            System.out.println(niece.getName());
        }
    }

    public void listUncles() {
        System.out.println("List of uncles:");
        for (Uncle uncle : uncles) {
            System.out.println(uncle.getName());
        }
    }
}