package ru.mirea.lab7;

public class Pug extends Dog{
    int size=35;
    Pug(){}
    Pug(String name, String color){
        super(name, color);
    }
     public void eat(){
          System.out.println("Собака ест еду для породы Мопс");
            happy=happy+10;
}
}
