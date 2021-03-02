package com.company;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b); //деление на ноль, как смогла в классе Calculator поправила код, вангую, что неверно=)))

        calc.println.accept(c);

    }
}