package com.daniel.abstractconceptquiz;

public class Lion extends Animal{
    @Override
    public void sound(String sound) {
        System.out.println("My sound goes: " + sound);
        System.out.println("Cause I am a Lion");
    }
}
