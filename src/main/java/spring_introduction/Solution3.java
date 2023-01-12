package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Solution3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Cat myCat = context.getBean("myPet", Cat.class);
//        myCat.setName("Belka");
        Cat yourCat = context.getBean("myPet", Cat.class);
//        yourCat.setName("Strelka");
        System.out.println("are the objects equal ? " + (myCat == yourCat));
        System.out.println(myCat);
        System.out.println(yourCat);
//        System.out.println(myCat.getName());
//        System.out.println(yourCat.getName());

        context.close();



    }
}
