public class Main {
    public static void main(String[] args) {
        Family family = new Family();

        // Menambah uncles
        family.addUncle("Albert");
        family.addUncle("Bill");

        // Menambah nieces
        family.addNiece("Amy", 12, 6);
        family.addNiece("Beatrice", 18, 8);

        // Menemukan uncle dan niece
        Uncle albert = family.findUncle("Albert");
        Niece amy = family.findNiece("Amy");

        // Menambahkan present
        if (albert != null && amy != null) {
            albert.addPresent(amy, "The Wonder of Computers");
        }

        // Melist uncles dan nieces
        family.listUncles();
        family.listNieces();

        // Melist presents
        if (albert != null) {
            albert.listPresents();
        }
        if (amy != null) {
            amy.listPresents();
        }
    }
}