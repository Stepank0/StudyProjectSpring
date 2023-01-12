package spring_introduction;

import junit.framework.TestCase;

public class PetTest extends TestCase {
    public static Pet pet;

    public void testDogSay() {
        pet = new Dog();
        pet.say();
        assertEquals("Bow-Wow", "Bow-Wow");

    }

    public void testCatSay(){
        pet = new Cat();
        pet.say();
        assertEquals("Meow-Meow", "Meow-Meow");
    }
}