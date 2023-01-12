package spring_introduction;

import java.io.PrintStream;

public class Person {

    private Pet pet;
    private String surname;
    private int age;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }

    public Person() {
        System.out.println("Person bean is created (first constructor)");
    }

    public Person(Pet pet) {
        this.pet = pet;
        System.out.println("Person bean is created (second constructor)");
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public void callYouPet(){
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
