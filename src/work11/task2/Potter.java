package work11.task2;

public class Potter implements fifthYear{

    @Override
    public void chooseElectives(String newElective) {
        System.out.println("Whatever you choose, you need potions to become an auror");
        elective = "Potions";
    }

    public String elective;
    public String name;
    public String secondName;

    public Potter(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    public void makeDumbledoresArmy() {
        System.out.println("Now you are head of Dumbledore's Army");
    }
}
