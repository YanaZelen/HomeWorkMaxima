package work12;

import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Work12 {

    static Scanner in = new Scanner(System.in);
    public static void Calculator() {
        System.out.print("Input the query character by character: ");
        try {
            double num1 = in.nextInt();
            char symbol = (char) System.in.read();
            double num2 = in.nextInt();
            double ans;
            switch (symbol) {
                case '+':
                    ans = num1 + num2;
                    System.out.print(num1 + " + " + num2 + " = " + ans);
                    break;
                case '-':
                    ans = num1 - num2;
                    System.out.print(num1 + " - " + num2 + " = " + ans);
                    break;
                case '*':
                    ans = num1 * num2;
                    System.out.print(num1 + " * " + num2 + " = " + ans);
                    break;
                case '/':
                    ans = num1 / num2;
                    System.out.print(num1 + " / " + num2 + " = " + ans);
                    break;
                default:
                    System.out.println("Sorry, I can't do this :0");
            }
        } catch (InputMismatchException e) {
            System.out.println("Please, input a NUMBER and a +, -, * or /");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

/*
Проверяемые и непроверяемые (Checked and Unchecked)
Проверяемые ошибки выкидывает комплятор Java, это ошибки, которые он "ожидает", которые предусмотрели
создатели Java.
Непроверяемые возникают когда на момент написания кода ошибок не было найдено, но при его работе
что-то пошло не так.
Поместить код, в котором может возникнуть потенциальная ошибка в try и отловить ошибки с помощью catch.
Через catch можно передавать сколько угодно ошибок. Или перебрасывать их через throw.
Можно, если возникает ошибка код после нее - не выполняется, поэтому может быть выполнен
только один catch.
Это блок, который выполнится в любом случае, даже если ни одной ошибки не выбудет, или наоборот они будет,
там может быть например выход из ридера или очистка памяти.
Throw - бросает исключение, throws предупреждает, что в данном методе может быть исключение
и его нужно обработать при вызове метода.
Можно, с помощью наследования от класса Exception.
Когда для выполнения нашего кода необходимы какие то условия, которые не обязательны
для компилятора Java.
 */