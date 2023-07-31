package com.suraj;

public class Main {

    public static void main(String[] args) {

        parent p1 = new parent();
        parent p2 = new parent("Ram", 34);
        p1.intro();
        p2.intro();

        child c1 = new child("Luv", 6, 2);
        c1.intro();
        c1.fruits("Mango");
        c1.fruits("Mango", "Grapes");
    }
}

class parent{
    private String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    parent(){
        this.name = "Anonymous";
        this.age = 0;
    }

    parent(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void intro()
    {
        System.out.println("Name of parent : " + this.name);
        System.out.println("Age of parent : " + this.age);
    }
}

class child extends parent{
    int std;
    child(){
        super();
        this.std = 0;
    }

    child(String name, int age, int std){
        super(name, age);
        this.std = std;
    }

    public void intro()
    {
        System.out.println("Name of child : " + this.getName());

        System.out.println("Age of child : " + this.age);
        System.out.println("Std of child : " + this.std);
    }

    public void fruits(String fruit1){
        System.out.println("I like " + fruit1);
    }

    public void fruits(String fruit1, String fruit2){
        System.out.println("I like " + fruit1 + ", " + fruit2);
    }




}
