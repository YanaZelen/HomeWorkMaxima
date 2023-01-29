package work11.task4;

public enum Faculties {
    SLITHERIN("Pride, Cunning, Ambition"),
    RAVENCLAW("Wit, Learning, Wisdom,"),
    GRYFFINDOR("Courage, Bravery, Determination"),
    HUFFLEPUFF("Patience, Fairness, Loyalty")
    ;

    public String quality;
    Faculties(String quality) {
        this.quality = quality;
    }

    public String getQuality() {
        return quality;
    }
}
