package ru.mirea.lab7;

    public abstract class Dog {
        private String color;
        private String name;
        private int happy=100;
        private int size;
        Dog(){}
        Dog(String name, String color){
            this.name=name;
            this.color=color;
           }
       
        public abstract void eat();// добавлен абстрактный класс
        
        public int getSize() {
            return size;
        }

        void bark(int size)
        {
            this.size=size;
            if(size>30){
                System.out.println("ГАВ-ГАВ");
            }
            else
            { System.out.println("тяф-тяф");}
            happy=happy+10;

        }
    
        }
        void mood(){
            System.out.println("Шкала счастья: "+ happy);}
        void sleep(){
            System.out.println("Собака уснула");
            happy=happy+10;}
    }





