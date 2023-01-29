package work11.task3;

public class Stupefy extends Spell{
    @Override
    public void move() {
        System.out.println("Lunge forward");
    }

    @Override
    public void effect() {
        System.out.println("You can hit/knock down an enemy");
    }
    public Stupefy(String formula) {
        this.formula = formula;
    }
}
