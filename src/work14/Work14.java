package work14;

public class Work14 {

    public static<T extends Number & Comparable> MinMax<T> Work14(T[] mas){

        T min = mas[0];
        T max = mas[0];
        int l;
        l = mas.length;

        for(int x = 1; x < l; x++){
            if(min.compareTo(mas[x]) > 0 ){
                min = mas[x];
            }
        }

        for(int x = 1; x < l; x++){
            if(max.compareTo(mas[x]) < 0 ){
                max = mas[x];
            }
        }

        return new MinMax<T>(min, max);
    }
}


