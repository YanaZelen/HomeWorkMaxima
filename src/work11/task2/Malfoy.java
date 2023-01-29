package work11.task2;

public class Malfoy implements Slytherin, fifthYear{
    @Override
    public void sayPottah() {
        System.out.println("Pottah, my father will hear about this");
    }

    @Override
    public void chooseElectives(String newElective) {
        System.out.println("You choose " + newElective);
        elective = newElective;
    }

    public String elective;
    public String name;
    public String secondName;

    public Malfoy(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    public static void becomeHeadOfTheFaculty() {
        System.out.println("Now you are head of the Slitherin");
    }
}
