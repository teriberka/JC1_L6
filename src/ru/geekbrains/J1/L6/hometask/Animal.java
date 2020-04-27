package ru.geekbrains.J1.L6.hometask;


public abstract class Animal {
    protected String name;
    protected String color;
    protected int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public abstract String run(int var);

    public abstract String swim(int var);

    public abstract String jump(float var);

}
