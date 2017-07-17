package com.noveogroup.internship.coderetreat;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Main main = new Main();
        main.test(arg -> {
            System.out.println(arg);
        });
    }


    public static int getCount() {
        return 5;
    }

    public void test(Listener listener) {
        listener.call("hello");
        listener.call("world");
    }

    interface Listener {
        void call(String string);
    }
}
