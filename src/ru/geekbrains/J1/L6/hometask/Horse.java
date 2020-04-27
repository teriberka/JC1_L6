package ru.geekbrains.J1.L6.hometask;
import java.util.Random;


public class Horse extends Animal {
//    final int runLimit = 1500;
//    final int jumpLimit = 3;
//    final int swimLimit = 100;
//
//
//    public Horse(String name, String color, int age) {
//        super(name, color, age);
//    }

    final int runLimit;
    final float jumpLimit;
    final int swimLimit;

    private static final Random RANDOM = new Random();
    static final int RUN_LIMIT = 1500;
    static final float JUMP_LIMIT = 3;
    static final int SWIM_LIMIT = 100;

    public Horse(String name, String color, int age) {
        super(name, color, age);
        this.runLimit = RUN_LIMIT - RANDOM.nextInt(100);
        this.jumpLimit = JUMP_LIMIT - RANDOM.nextFloat();
        this.swimLimit = SWIM_LIMIT - RANDOM.nextInt(20);
    }


    @Override
    public String run(int runDist) {
        if (runLimit >= runDist){
            return "Лошадь пробежала " + runDist + "м!";
        } else {
            return "Лошадь не смогла пробежать " + runDist + "м!";
        }

    }

    @Override
    public String swim(int swimDist) {
        if (swimLimit >= swimDist){
            return "Лошадь проплыла " + swimDist + "м!";
        } else {
            return "Лошадь не смогла проплыть " + swimDist + "м!";
        }

    }

    @Override
    public String jump(float jumpLength) {
        if (jumpLimit >= jumpLength){
            return "Лошадь прыгнула " + jumpLength + "м!";
        } else {
            return "Лошадь не смогла прыгнуть " + jumpLength + "м!";
        }
    }
}
