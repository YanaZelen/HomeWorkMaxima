package work11.task3;

public abstract class Spell {
    String formula;

    public abstract void move();
    public abstract void effect();
    public void makeIt() {
        System.out.println(formula + "!!!");
    }
}
