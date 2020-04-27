package ru.geekbrains.J1.L6.hometask;
import java.util.Random;


public class Cat extends Animal {

//    final static int runLimit = 200;
//    final static int jumpLimit = 2;
//    final static int swimLimit = 0;

//    public Cat(String name, String color, int age) {
//        super(name, color, age);
//    }

    final int runLimit;
    final float jumpLimit;
    final int swimLimit;

    private static final Random RANDOM = new Random();
    static final int RUN_LIMIT = 200;
    static final float JUMP_LIMIT = 2;
    static final int SWIM_LIMIT = 0;

    public Cat(String name, String color, int age) {
        super(name, color, age);
        this.runLimit = RUN_LIMIT - RANDOM.nextInt(100);
        this.jumpLimit = JUMP_LIMIT - RANDOM.nextFloat();
        this.swimLimit = SWIM_LIMIT;
    }

    @Override
    public String run(int runDist) {
        if (runLimit >= runDist){
            return "Кошка пробежала " + runDist + "м!";
        } else {
            return "Кошка не смогла пробежать " + runDist + "м!";
        }

    }

    @Override
    public String swim(int swimDist) {
        return "Кошка не умеет плавать!";


    }

    @Override
    public String jump(float jumpLength) {
        if (jumpLimit >= jumpLength){
            return "Кошка прыгнула " + jumpLength + "м!";
        } else {
            return "Кошка не смогла прыгнуть " + jumpLength + "м!";
        }
    }

}
