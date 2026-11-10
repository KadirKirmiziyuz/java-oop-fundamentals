package org.javaturk.oopj.ch02;

public class HelloTest {

    public static void main(String[] args) {
        Hello object = new Hello();

        String answer = object.sayHello("Mehmet");
        System.out.println(answer);

        answer = object.sayHello("");
        System.out.println(answer);
    }
}