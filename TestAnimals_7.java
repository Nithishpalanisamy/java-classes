abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    abstract void eat();

    void walk() {
        System.out.println("This animal walks on " + legs + " legs.");
    }
}

class Spider extends Animal {
    public Spider() {
        super(8);
    }

    @Override
    void eat() {
        System.out.println("The spider eats.");
    }
}

interface Pet {
    String getName();
    void setName(String name);
    void play();
}

class Cat extends Animal implements Pet {
    private String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        this("");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name + " plays.");
    }

    @Override
    void eat() {
        System.out.println(name + " eats.");
    }
}

class Fish extends Animal implements Pet {
    private String name;

    public Fish() {
        super(0);
    }

    @Override
    void walk() {
        System.out.println("Fish can't walk.");
    }

    @Override
    void eat() {
        System.out.println(name + " eats.");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name + " plays.");
    }
}

public class TestAnimals_7 {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        // Call methods in each object
        d.eat();
        c.eat();
        a.walk();
        e.walk();
        p.play();

        // Casting objects
        ((Cat) p).walk();

        // Using polymorphism
        Animal animal = c;
        animal.eat();
        animal.walk();

        // Using super to call superclass methods
        // This is not applicable here as we don't have any overridden methods in subclasses that call superclass methods.
    }
}

