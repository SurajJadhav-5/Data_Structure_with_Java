package com.suraj;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Example - 1
        Student std1;
        std1 = new Student();
//        System.out.println(std1);

        //when not defined it will print default values

        // when class has constructor then it will print values from constructor
//        System.out.println(std1.rno);
//        System.out.println(std1.name);
//        System.out.println(std1.marks);
//        std1.greeting();

        // New values assign
        std1.rno = 10;
        std1.name = "Suraj";
        std1.marks= 99.23f;
//        System.out.println(std1.rno);
//        System.out.println(std1.name);
//        System.out.println(std1.marks);
//        std1.greeting();
//        std1.changeName("Ram");
//        std1.greeting();


        Student std2 = new Student(30, "Naruto", 35.11f);
//        std2.greeting();

        //constructor as a parameter
        Student std3 = new Student(std2);
        System.out.println(std3.name);

        // calling another constructor
        Student std4 = new Student();
        System.out.println(std4.name);

        Student one = new Student();
        Student two = one; // both are poining to same data if one changes other one will also be change
        System.out.println(two.name);







    }

    static class Student{
        int rno;
        String name;
        float marks = 40;

        Student(){
            // giving default values
//                this.rno =20;
//                this.name = "Dhiraj";
//                this.marks = 99.99f;

            // calling another constructor
            this(50, "Hinata", 89);
        }

        Student(int rno, String name, float marks){   // constructor overloading
            this.rno =rno;
            this.name = name;
            this.marks = marks;
        }

        Student( Student other){     // constructor as a parameter
            this.rno = other.rno;
            this.name = other.name;
            this.marks = other.marks;
        }

        void greeting(){
            System.out.println("Hello " + this.name);
        }

        void changeName(String name){
            //this.name(LHS) is referring to actual previous name & parameter name(RHS) is referring to new name
            this.name = name;
        }


    }


}
