package com.avi.reflection.models;

/**
 * Created by Avishek on 15-May-17.
 */
public class Dog extends Animal {

    @Override
    public String call() {
        return "The dog is barking";
    }

    public String move() {
        return "The dog is running";
    }
}
