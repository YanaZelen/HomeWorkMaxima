package work9;

import java.util.Objects;
import java.util.Scanner;

public class Work9 {

    static Scanner in = new Scanner(System.in);

    static void task1() {
        for (int i = 1; i < 10; i++) {
            System.out.println();
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }


    static void task2For() {
        System.out.print("Input a number: ");
        int num = in.nextInt();
        int i = 0; int j = 1; int h;
        System.out.println(0); System.out.println(1);
        for (int k = 1; k <= num - 2; k ++) {
            System.out.println(i + j);
            h = i; i = j; j = h + j;
        }
    }
    static void task2While() {
        System.out.print("Input a number: ");
        int num = in.nextInt();
        int i = 0;
        int j = 1;
        int h;
        int k = 1;
        System.out.println(0);
        System.out.println(1);
        while (k <= num - 2) {
            System.out.println(i + j);
            h = i;
            i = j;
            j = h + j;
            k++;
        }
    }
    static void task2DoWhile() {
        System.out.print("Input a number: ");
        int num = in.nextInt();
        int i = 0;
        int j = 1;
        int h;
        int k = 1;
        System.out.println(0);
        System.out.println(1);
        do {
            System.out.println(i + j);
            h = i;
            i = j;
            j = h + j;
            k++;
        }
        while (k <= num - 2);
    }


    static void task3DoWhile() {
        System.out.print("Input a number: ");
        int num = in.nextInt();
        int summa = 0;
        do {
            summa = summa + num % 10;
            num = num / 10;
        }
        while (num != 0);
        System.out.println(summa);
    }
    static void task3While() {
        System.out.print("Input a number: ");
        int num = in.nextInt();
        int summa = 0;
        while (num != 0) {
            summa = summa + num % 10;
            num = num / 10;
        };
        System.out.println(summa);
    }
    static void task3For() {
        System.out.print("Input a number: ");
        int num = in.nextInt();
        int summa = 0;
        int l = String.valueOf(num).length();
        for (int i = 0; i < l; i++) {
            summa = summa + num % 10;
            num = num / 10;
        };
        System.out.println(summa);
    }


    static void task4For() {
        System.out.print("Input string(words through spaces): "); //коток слов строка потоп слов реппер
        String str = in.nextLine();
        str = str.toLowerCase();
        str = str.replaceAll("\\p{Punct}", "");
        String[] arr = str.split(" ");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            String[] need = arr[i].split("");
            boolean answ = true;
            for (int j = 0; j < arr[i].length() / 2; j++) {
                int n = arr[i].length() - 1;
                if (Objects.equals(need[j], need[n - j])) {
                    answ = true;
                } else {
                    answ = false;
                }
            }
            if (answ) {
                count++;
            }
        }
        System.out.print(count);
    }


    static void task5If() {
        System.out.print("Input a number(From 1 to 12): ");
        int num = in.nextInt();
        if (num == 12 | num == 1 | num == 2) {
            System.out.print("ЗИМА");
        } else if (num == 3 | num == 4 | num == 5) {
            System.out.print("ВЕСНА");
        } else if (num == 6 | num == 7 | num == 8) {
            System.out.print("ЛЕТО");
        } else if (num == 9 | num == 10 | num == 11) {
            System.out.print("ОСЕНЬ");
        } else {
            System.out.print("Не верное число");
        }
    }
    static void task5Switch() {
        System.out.print("Input a number(From 1 to 12): ");
        int num = in.nextInt();
        switch (num) {
            case 12:
            case 1:
            case 2:
                System.out.print("ЗИМА");
                break;
            case 3:
            case 4:
            case 5:
                System.out.print("ВЕСНА");
                break;
            case 6:
            case 7:
            case 8:
                System.out.print("ЛЕТО");
                break;
            case 9:
            case 10:
            case 11:
                System.out.print("ОСЕНЬ");
                break;
            default:
                System.out.print("Не верное число");
                break;
        }
    }
    static void task5X() {
        int counter = 0;
        for (int i = 0; i <= 24; i++) {
            for (int j = 0; j <= 60; j++) {
                if (i == 0 && j == 0) {
                    counter++;
                    System.out.println("Время " + 0 + i + ":" + 0 + j + " - " + "Всего случаев: " + counter);
                } else if (i == (j / 10) && j % 10 == 0) {
                    counter++;
                    System.out.println("Время " + 0 + i + ":" + j + " - " + "Всего случаев: " + counter);
                } else if (i / 10 == j % 10 && i % 10 == j / 10 && i % 10 == 0) {
                    counter++;
                    System.out.println("Время " + i + ":" + 0 + j + " - " + "Всего случаев: " + counter);
                } else if (i / 10 == j % 10 && i % 10 == j / 10) {
                    counter++;
                    System.out.println("Время " + i + ":" + j + " - " + "Всего случаев: " + counter);
                }
            }
        }
    }


    static void task6For() {
        System.out.print("Input a number: ");
        int num = in.nextInt();
        String answ = new String();
        while (num != 0) {
            answ = answ + num % 2;
            num = num / 2;
        }
        answ = new StringBuilder(answ).reverse().toString();
        System.out.println("Число " + num + " в двоичной системе равно " + answ);
    }
    static String answRecurs = new String();
    static String task6recurs(int num) {
        if (num == 0) {
            answRecurs = new StringBuilder(answRecurs).reverse().toString();
            return answRecurs;
        } else {
            answRecurs = answRecurs + num % 2;
            return task6recurs(num / 2);
        }
    }


    static int task7 = 5;
    static String task7recurs(int degree) {
        if (task7 == 0) {
            answRecurs = new StringBuilder(answRecurs).reverse().toString();
            return answRecurs;
        } else {
            answRecurs = answRecurs + task7 % degree;
            return task6recurs(task7 / degree);
        }
    }


    static int summaTask8 = 0;
    static int counter = 0;
    static int task8(int num) {
        if (counter == 0) {
            String str = String.valueOf(num);
            StringBuilder builder = new StringBuilder(str);
            builder.reverse();
            num = Integer.parseInt(builder.toString());
            counter++;
        }
        if (num == 0) {
            System.out.print(" = ");
            return summaTask8;
        } else {
            summaTask8 = summaTask8 + num % 10;
            System.out.print(num % 10);
            if (num > 10) {
                System.out.print(" + ");
            }
            return task8 (num / 10);
        }
    }

}
