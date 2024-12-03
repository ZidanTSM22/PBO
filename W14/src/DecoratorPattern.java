interface Component1 {
    void operation();
}

class ConcreteComponent implements Component1 {
    public void operation() {
        System.out.println("Base Operation");
    }
}

class Decorator implements Component1 {
    private Component1 component1;

    public Decorator(Component1 component) {
        this.component1 = component1;
    }

    public void operation() {
        component1.operation();
        System.out.println("Additional Operation by Decorator");
    }
}

public class DecoratorPattern {
    public static void main(String[] args) {
        Component1 base = new ConcreteComponent();
        Component1 decorated = new Decorator(base);

        base.operation();
        decorated.operation();
    }
}
