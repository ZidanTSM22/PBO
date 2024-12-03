import java.util.ArrayList;
import java.util.List;

interface Component {
    void display();
}

class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Leaf: " + name);
    }
}

class Composite implements Component {
    private List<Component> children = new ArrayList<>();

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    public void display() {
        for (Component child : children) {
            child.display();
        }
    }
}

public class CompositePattern {
    public static void main(String[] args) {
        Composite root = new Composite();
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite subtree = new Composite();
        subtree.add(new Leaf("Leaf X"));
        subtree.add(new Leaf("Leaf Y"));

        root.add(subtree);
        root.display();
    }
}
