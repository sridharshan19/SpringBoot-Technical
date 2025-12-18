package org.spring;

public class Bike {

    //private int age;
    //private int roll_no;
    //private Engine engine;
    private Vehicle v;

    public void setV(Vehicle v){
        this.v = v;
    }

    public void work() {
        // Correct method
        v.move();
    }
}
