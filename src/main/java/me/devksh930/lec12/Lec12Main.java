package me.devksh930.lec12;

public class Lec12Main {
    public static void main(String[] args) {
//        Person.Companion.newBaby("ABC");
//        Person.Factory.newBaby("ABC");
        Person.newBaby("ABC");

        moveSomething(new Movable() {
            @Override
            public void move() {
                System.out.println(" 무브무브");
            }

            @Override
            public void fly() {
                System.out.println("날다날다");
            }
        });
    }

    private static void moveSomething(Movable movable) {
        movable.move();
        movable.fly();
    }
}
