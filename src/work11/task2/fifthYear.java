package work11.task2;

public interface fifthYear {
    public default void passOWLs(char mark){
        switch (mark) {
            case 'O':
            case 'E':
            case 'A':
                System.out.println("Congrats, you passed!");
                break;
            case 'P':
            case 'D':
            case 'T':
                System.out.println("Sorry, see you next year again");
                break;
        }
    }
    public void chooseElectives(String newElective);
}
