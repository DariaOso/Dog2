package ru.mirea.lab7;
public class Poodle extends Dog{
    int size=50;
    Poodle(){}
    Poodle(String name, String color){
        super(name, color);
    }
     public void eat(){
          System.out.println("Собака ест еду для породы Пудель");
            happy=happy+10;
}
}
