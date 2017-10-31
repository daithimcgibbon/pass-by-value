package com.theeadversary.main;

/**
 * Prints out...
 * 10
 * 11
 * 11
 * ...because a copy of the reference is passed to the method but the copy points to the same place so changes the 'value' that the original points to
 */
public class PassReference {

    public static void main(String[] args) {
        new PassReference();
    }

    public PassReference() {
        TestObject testObject = new TestObject(10);
        System.out.println(testObject);
        makeChanges(testObject);
        System.out.println(testObject);
    }

    public void makeChanges(TestObject testObject)   {
        testObject.setValue(11);
        System.out.println(testObject);
    }
}
