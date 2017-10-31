package com.theeadversary.main;

/**
 * Simple test object with a toString to print it's state
 */
public class TestObject {

    private int value = 0;

    public TestObject(int value) {
        this.value = value;
    }

    public int getValue()   {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString()    {
        return "The value is " + value;
    }
}