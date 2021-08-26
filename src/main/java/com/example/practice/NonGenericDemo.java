package com.example.practice;

/**
 * NonGeneric
 */
class NonGeneric {

    Object obj;

    NonGeneric(Object o) {
        obj = o;
    }

    Object getObj() {
        return obj;
    }

    void showType() {
        System.out.println("Type of ob is: " + obj.getClass().getName());
    }
}

public class NonGenericDemo {
    public static void main(String[] args) {
        NonGeneric iOb;
        iOb = new NonGeneric(88);
        iOb.showType();
        int v = (int) iOb.getObj();
        System.out.println("Value: " + v);

        NonGeneric stringObj;
        stringObj = new NonGeneric("Non-Generic Test");
        stringObj.showType();
        String str = (String) stringObj.getObj();
        System.out.println("Value: " + str);

        iOb = stringObj;
        v = (int) iOb.getObj();
    }
}
