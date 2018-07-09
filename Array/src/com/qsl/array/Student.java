package com.qsl.array;

public class Student {

    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return String.format("Student{name: %s, score: %d}", name, score);
    }

    public static void main(String[] args) {
        Array<Student> array = new Array<>();
        array.addLast(new Student("Alice", 100));
        array.addLast(new Student("Tom", 80));
        array.addLast(new Student("Charlie", 60));

        System.out.println(array);
    }
}
