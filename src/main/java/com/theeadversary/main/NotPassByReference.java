package com.theeadversary.main;

/**
 * Prints out...
 * 10
 * 11
 * 11 - because orginal reference pointing to same place as copy
 * 20 - copy reference overwritten to new location
 * 11 - orginal reference unchanged
 */
public class NotPassByReference {

    public static void main(String[] args) {
        new NotPassByReference();
    }

    public NotPassByReference() {
        TestObject testObject = new TestObject(10);
        System.out.println(testObject);
        makeChanges(testObject);
        System.out.println(testObject);
        makeReferenceChange(testObject);
        System.out.println(testObject);
    }

    public void makeReferenceChange(TestObject testObject) {
        testObject = new TestObject(20);
        System.out.println(testObject);
    }

    public void makeChanges(TestObject testObject)   {
        testObject.setValue(11);
        System.out.println(testObject);
    }
}
