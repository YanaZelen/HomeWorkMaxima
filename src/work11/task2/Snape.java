package work11.task2;

public class Snape implements Slytherin {
    @Override
    public void sayPottah() {
        System.out.println("Mister Pottah");
    }

    public String name;
    public String secondName;

    public Snape(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    public void walkDevelopingTheMantle() {
        System.out.println("Congrats you are amazing");
    }
}
