package ru.geekbrains.J1.L6.hometask;
import java.util.Random;

public class Dog extends Animal{
//    final int runLimit = 500;
//    final float jumpLimit = 0.5f;
//    final int swimLimit = 10;
//
//    public Dog(String name, String color, int age) {
//        super(name, color, age);
//    }

    final int runLimit;
    final float jumpLimit;
    final int swimLimit;

    private static final Random RANDOM = new Random();
    static final int RUN_LIMIT = 500;
    static final float JUMP_LIMIT = 0.5f;
    static final int SWIM_LIMIT = 10;

    public Dog(String name, String color, int age) {
        super(name, color, age);
        this.runLimit = RUN_LIMIT - RANDOM.nextInt(100);
        this.jumpLimit = JUMP_LIMIT - RANDOM.nextFloat();
        this.swimLimit = SWIM_LIMIT - RANDOM.nextInt(2);
    }


    @Override
    public String run(int runDist) {
        if (runLimit >= runDist){
            return "Собака пробежала " + runDist + "м!";
        } else {
            return "Собака не смогла пробежать " + runDist + "м!";
        }

    }

    @Override
    public String swim(int swimDist) {
        if (swimLimit >= swimDist){
            return "Собака проплыла " + swimDist + "м!";
        } else {
            return "Собака не смогла проплыть " + swimDist + "м!";
        }

    }

    @Override
    public String jump(float jumpLength) {
        if (jumpLimit >= jumpLength){
            return "Собака прыгнула " + jumpLength + "м!";
        } else {
            return "Собака не смогла прыгнуть " + jumpLength + "м!";
        }
    }

}
