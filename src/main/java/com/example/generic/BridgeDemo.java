package com.example.generic;

class Generic<T> {
    T ob;

    public Generic(T ob) {
        this.ob = ob;
    }

    T getObject() {
        return ob;
    }
}

class GenericTwo extends Generic<String> {
    public GenericTwo(String ob) {
        super(ob);
    }

    @Override
    String getObject() {
        System.out.println("You call String getObject(): ");
        return ob;
    }
}

public class BridgeDemo {
    public static void main(String[] args) {
        GenericTwo gen2 = new GenericTwo("Generics Test");
        System.out.println(gen2.getObject());
    }
}
