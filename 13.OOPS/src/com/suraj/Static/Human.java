package com.suraj.Static;

public class Human{
        int age;
        String name;
        float weight;
        static long population;

        public Human(int age, String name, float weight) {
            this.age = age;
            this.name = name;
            this.weight = weight;
            Human.population += 1;
        }
}