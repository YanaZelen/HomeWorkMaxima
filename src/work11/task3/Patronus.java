package work11.task3;

public class Patronus extends Spell {
    String animal;
    @Override
    public void move() {
        System.out.println("You need to remember the happiest moment in your life");
    }

    @Override
    public void effect() {
        System.out.println("Oh, look at your " + animal + "!");
    }

    public Patronus(String formula, String animal) {
        this.formula = formula;
        this.animal = animal;
    }
}
