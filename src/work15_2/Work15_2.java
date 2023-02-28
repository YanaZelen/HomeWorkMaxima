package work15_2;

/*Задание 4 (усложняем)

Структура как из прошлого задания.
Необходимо вернуть список купленных товаров с определённым именем за определённый промежуток.
Это значит был LIst<Order> а стал List<Item> в котором только те товары, что купили в промежуток от и до и в их имени присутствуют определённая строка
( На входе ключ “От” на выходе все детали у которых в имени присутствуют “*От*” или “от” , без учёта регистра)
И самое главное это всё за 1 Stream


 */

import java.util.*;
import java.util.stream.Stream;
import java.time.LocalDateTime;

public class Work15_2 {

    static Scanner in = new Scanner(System.in);

    Item examp = new Item(1, "Name1");
    Item examp2 = new Item(2, "Name2");
    Item examp3 = new Item(3, "Name3");
    Item examp4 = new Item(4, "Name5");

    static LocalDateTime localDate1 = LocalDateTime.of(2022, 12, 20, 3, 20);
    static LocalDateTime localDate2 = LocalDateTime.of(2022, 8, 21, 4, 20);
    static LocalDateTime localDate3 = LocalDateTime.of(2023, 1, 22, 5, 20);
    static LocalDateTime localDate4 = LocalDateTime.of(2023, 2, 23, 6, 20);
    static LocalDateTime localDate5 = LocalDateTime.of(2023, 2, 24, 7, 20);

    public static void task1() {

        String[] suNames = {"Спилберг","Тарантино","Андерсон", "Сорентино", "Елкин", "Скорсезе", "Емелин", "Шьямалан"};
        Stream<String> streamFromSuNames = Arrays.stream(suNames);

        streamFromSuNames.filter(str -> str.startsWith("Е")).forEach(System.out::println);
    }

    public static void task2() {

        System.out.print("Введите слова через пробел: ");
        String takeThis = in.nextLine();
        Stream<String> listOfWords = Arrays.stream(takeThis.split( " " ));
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

        @Override
        public String toString() {
            return "Item{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }


    /*
Задание 3

Есть POJO класс Заказов и его комплектующие

На входе подаётся LIst<Order>
Вернуть все заказы, которые были совершены в определённом промежутке времени (от и до).
 */
    public void task3() {

        LocalDateTime start = LocalDateTime.of(2020, 12, 1, 0, 1);
        LocalDateTime end = LocalDateTime.of(2023, 2, 10, 0, 1);

        List<Order> orderList = new ArrayList<>(Arrays.asList(
                new Order(11, "Order1", List.of(new Item[]{examp, examp2, examp3}), localDate1),
                new Order(12, "Order2", List.of(new Item[]{examp2, examp3}), localDate2),
                new Order(13, "Order3", List.of(new Item[]{examp2, examp2, examp4}), localDate3),
                new Order(14, "Order4", List.of(new Item[]{examp4}), localDate4),
                new Order(15, "Order5", List.of(new Item[]{examp, examp2}), localDate1)));
        
        orderList.stream()
                .filter(s-> (s.getCreateDate().isAfter(start) && s.getCreateDate().isBefore(end))).forEach(System.out::println);
    }
}

/*
Теоретический блок
Что такое Функциональное программирование и отличия от ООП
Зачем нужные функциональные интерфейсы
Какие особенности накладывает аннотация @FunctionalInterface
Что такое лямбда выражение
Как и где применяется лямбда выражение
Что такое StreamAPI
Что такое терминальные и промежуточные операции
 */