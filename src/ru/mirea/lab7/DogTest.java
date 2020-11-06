package ru.mirea.lab7;

public class DogTest{
    public static void main(String[] args){
        Akita a=new Akita();
        a.bark(50);
        a.eat();
        a.sleep();
        a.mood();
       System.out.println( a.getSize());
    }
}