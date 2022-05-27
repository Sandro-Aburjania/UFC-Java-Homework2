package Assigment5.Java;

public class Main {
    public static void main(String[] args) {
        new Student().display();
    }
}


class Student{
    private String name;
    private int age;

    public Student(){
        this.name = "Aleksandre";
        this.age = 19;
    }

    public void display(){
        System.out.println("სტუდენტის სახელია: " + this.name);
        System.out.println(this.name + "-ეს ასაკია " + this.age);
    }

}
