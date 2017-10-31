package com.theeadversary.main;

/**
 * Prints out...
 * 10
 * 11
 * 10
 * ... because a copy of the value is passed to the method and any changes there do not affect the original variable
 */
public class PassPrimative {

    public static void main(String[] args) {
        new PassPrimative();
    }

    public PassPrimative() {

        int a = 10;

        System.out.println("main a: " + a);
        makeChanges(a);
        System.out.println("main a: " + a);
    }

    public void makeChanges(int value) {
        value++;
        System.out.println("makeChanges value: " + value);
    }

}
