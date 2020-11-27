package ru.mirea.lab7;

public class Pomeranian extends Dog{
    int size=25;
    Pomeranian(){}
    Pomeranian(String name, String color){
        super(name, color);
    }
     public void eat(){
          System.out.println("Собака ест еду для породы Померан");
            happy=happy+10;
}
}
