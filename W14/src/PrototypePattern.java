interface Prototype extends Cloneable {
    Prototype clone();
}

class ConcretePrototype implements Prototype {
    private String field;

    public ConcretePrototype(String field) {
        this.field = field;
    }

    public Prototype clone() {
        return new ConcretePrototype(this.field);
    }

    public String getField() {
        return field;
    }
}

public class PrototypePattern {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype("Original");
        ConcretePrototype copy = (ConcretePrototype) prototype.clone();

        System.out.println("Original: " + prototype.getField());
        System.out.println("Copy: " + copy.getField());
    }
}
