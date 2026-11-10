package org.javaturk.oopj.ch02;

class Hello {

    private String world = "everyone";

    public String sayHello(String name) {
        String sentence;
        if (!name.isEmpty()) {
            sentence = "Hello " + name + " :)";
        } else {
            sentence = "Hello " + world + " :)";
        }
        return sentence;
    }
}