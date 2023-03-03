package work15_2;


import java.util.*;
import java.util.stream.Stream;
import java.time.LocalDateTime;

public class Work15_2 {

    static Scanner in = new Scanner(System.in);

    Item examp = new Item(1, "NameYES");
    Item examp2 = new Item(2, "Nameyes");
    Item examp3 = new Item(3, "NameNO");
    Item examp4 = new Item(4, "NameNo");

    static LocalDateTime localDate1 = LocalDateTime.of(2022, 12, 20, 3, 20);
    static LocalDateTime localDate2 = LocalDateTime.of(2022, 8, 21, 4, 20);
    static LocalDateTime localDate3 = LocalDateTime.of(2023, 1, 22, 5, 20);
    static LocalDateTime localDate4 = LocalDateTime.of(2023, 2, 23, 6, 20);
    static LocalDateTime localDate5 = LocalDateTime.of(2023, 2, 24, 7, 20);

    List<Order> orderList = new ArrayList<>(Arrays.asList(
            new Order(11, "Order1", List.of(new Item[]{examp, examp2, examp3}), localDate1),
            new Order(12, "Order2", List.of(new Item[]{examp2, examp3}), localDate2),
            new Order(13, "Order3", List.of(new Item[]{examp2, examp2, examp4}), localDate3),
            new Order(14, "Order4", List.of(new Item[]{examp4}), localDate4),
            new Order(15, "Order5", List.of(new Item[]{examp, examp2}), localDate5)));

    LocalDateTime start = LocalDateTime.of(2020, 12, 1, 0, 1);
    LocalDateTime end = LocalDateTime.of(2023, 2, 10, 0, 1);

    public static void task1() {

        String[] suNames = {"Спилберг", "Тарантино", "Андерсон", "Сорентино", "Елкин", "Скорсезе", "Емелин", "Шьямалан"};
        Stream<String> streamFromSuNames = Arrays.stream(suNames);

        streamFromSuNames.filter(str -> str.startsWith("Е")).forEach(System.out::println);
    }

    public static void task2() {

        System.out.print("Введите слова через пробел: ");
        String takeThis = in.nextLine();
        Stream<String> listOfWords = Arrays.stream(takeThis.split(" "));
        listOfWords.peek((e) -> System.out.print(e + " ")).sorted().forEach((e) -> System.out.print(e + " "));
    }


    public class Order {
        long id;
        String name;
        List<Item> itemList; // Это то, что заказали
        LocalDateTime createDate;

        public Order(long id, String name, List<Item> itemList, LocalDateTime createDate) {
            this.id = id;
            this.name = name;
            this.itemList = itemList;
            this.createDate = createDate;
        }

        public LocalDateTime getCreateDate() {
            return createDate;
        }

        public long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public List<Item> getItemList() {
            return itemList;
        }

        @Override
        public String toString() {
            return "Order{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", itemList=" + itemList +
                    ", createDate=" + createDate +
                    '}';
        }
    }

    public class Item {
        long id;
        String name;

        public Item(long id, String name) {
            this.id = id;
            this.name = name;
        }

        public long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public void task3() {

        orderList.stream()
                .filter(s -> (s.getCreateDate().isAfter(start) && s.getCreateDate().isBefore(end))).forEach(System.out::println);
    }

    public void task4(String substr) {

        orderList.stream()
                .filter(s -> (s.getCreateDate().isAfter(start) && s.getCreateDate().isBefore(end))).flatMap(t -> t.getItemList().stream()).filter(m -> m.name.toLowerCase().contains(substr)).forEach(System.out::println);
/*
Я не очень поняла, что конкретно нужно вывести, но решила, что "список купленных товаров" - это вывести просто товары по данному фильтру, без заказа, в котором они.
 */
    }
}

