package work15;

import java.util.*;

public class Work15 {
    static Random r = new Random();
    static int num;
    static Scanner in = new Scanner(System.in);


    public static List<Integer> task1() {

        List<Integer> ourList = new ArrayList<>();

        for (int counter = 1; counter <= 20; counter++) {
            num = r.nextInt(100);
            while (ourList.contains(num)) {
                num = r.nextInt(100);
            }
            ourList.add(num);
        }

        Collections.sort(ourList);
        return ourList;
    }

    public static Set<String> task2() {
        System.out.print("Input string: ");
        String takeThis = in.nextLine();
        String takeThis_ = takeThis.replaceAll("\\W", " ").toLowerCase();

        return new HashSet<String>(Arrays.asList(takeThis_.split(" ")));
    }

    public static Map<String, Integer> task3() {
        System.out.print("Input string: ");
        String ourString = in.nextLine().toLowerCase();

        Set<String> ourSet = new HashSet<String>(Arrays.asList(ourString.split("")));
        String[] ourList = ourSet.toArray(new String[ourSet.size()]);
        int l = ourList.length;

        HashMap<String, Integer> wordsAndCount = new HashMap<>();
        for (String s : ourList) {
            int counter;
            counter = ourString.length() - ourString.replace(String.valueOf(s), "").length();
            wordsAndCount.put(s, counter);
        }

        return wordsAndCount;
    }

}