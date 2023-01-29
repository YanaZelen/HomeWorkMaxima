package work11.task3;

public class WingardiumLeviosa extends Spell{
    @Override
    public void move() {
        System.out.println("You need to wish and flick");
    }

    @Override
    public void effect() {
        System.out.println("Oh, look, your feather is in the air");
    }
    public WingardiumLeviosa(String formula) {
        this.formula = formula;
    }
}
