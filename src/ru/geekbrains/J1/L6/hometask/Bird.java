package ru.geekbrains.J1.L6.hometask;
import java.util.Random;


public class Bird extends Animal {
//    final int runLimit = 5;
//    final float jumpLimit = 0.2f;
//    final int swimLimit = 0;
//
//
//    public Bird(String name, String color, int age) {
//        super(name, color, age);
//    }

    final int runLimit;
    final float jumpLimit;
    final int swimLimit;

    private static final Random RANDOM = new Random();
    static final int RUN_LIMIT = 5;
    static final float JUMP_LIMIT = 0.2f;
    static final int SWIM_LIMIT = 0;

    public Bird(String name, String color, int age) {
        super(name, color, age);
        this.runLimit = RUN_LIMIT - RANDOM.nextInt(100);
        this.jumpLimit = JUMP_LIMIT - RANDOM.nextFloat();
        this.swimLimit = SWIM_LIMIT;
    }

    @Override
    public String run(int runDist) {
        if (runLimit >= runDist){
            return "Птица пробежала " + runDist + "м!";
        } else {
            return "Птица не смогла пробежать " + runDist + "м!";
        }

    }

    @Override
    public String swim(int swimDist) {
            return "Птица не умеет плавать !";
    }

    @Override
    public String jump(float jumpLength) {
        if (jumpLimit >= jumpLength){
            return "Птица прыгнула" + jumpLength + "м!";
        } else {
            return "Птица не смогла прыгнуть " + jumpLength + "м!";
        }
    }

}
