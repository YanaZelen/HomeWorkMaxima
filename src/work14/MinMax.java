package work14;

public class MinMax<T> {
    private T numMin;
    private T numMax;

    public MinMax(T numMin, T numMax){
        this.numMin = numMin;
        this.numMax = numMax;
    }

    public T getNumMin() {
        return numMin;
    }

    public void setNumMin(T numMin) {
        this.numMin = numMin;
    }

    public T getNumMax() {
        return numMax;
    }

    public void setNumMax(T numMax) {
        this.numMax = numMax;
    }
}