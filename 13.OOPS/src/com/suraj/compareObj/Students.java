package com.suraj.compareObj;

public class Students implements Comparable<Students> {
    int roll;
    float marks;

    Students(int roll, float marks){
        this.marks = marks;
        this.roll = roll;
    }

    @Override
    public int compareTo(Students o){
        return (int)(this.marks - o.marks);
    }
    public static void main(String[] args) {
        Students suraj = new Students(10, 79.34f);
        Students raj = new Students(20, 78.34f);

//        System.out.println(suraj > raj);  // we cant coampare objects like this
        System.out.println((suraj.compareTo(raj)));
        if(suraj.compareTo(raj) < 0)
            System.out.println("Suraj has less marks than Raj");
        if(suraj.compareTo(raj) == 0)
            System.out.println("Suraj is equal to Raj");
        if(suraj.compareTo(raj) > 0)
            System.out.println("Suraj has more marks than Raj");

    }
}
