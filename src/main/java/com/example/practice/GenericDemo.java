package com.example.practice;

/**
 * Gen<T>
 */
class Gen<T> {
    T ob;

    Gen(T ob) {
        this.ob = ob;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Type of T is: " + ob.getClass().getName());
    }

    @Override
    public String toString() {
        return "Value: " + ob.toString();
    }
}

public class GenericDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb;
        iOb = new Gen<Integer>(88);
        iOb.showType();
        System.out.println(iOb);

        Gen<String> stringObj;
        stringObj = new Gen<String>("Generic Test");
        stringObj.showType();
        System.out.println(stringObj);

        TwoGenericType<String,Integer> twoGenericType;
        twoGenericType = new TwoGenericType<String,Integer>("Generic", 88);
        twoGenericType.showType();
        System.out.println("Value: " + twoGenericType.getObOne());
        System.out.println("Value: " + twoGenericType.getObTwo());
    }
}
