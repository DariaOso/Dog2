package ru.mirea.lab7;

public class Akita extends Dog{
    int size=60;
    Akita(){}
    Akita(String name, String color){
        super(name, color);
    }
    public void eat(){
          System.out.println("Собака ест еду для породы Акита");
            happy=happy+10;
    }
}
