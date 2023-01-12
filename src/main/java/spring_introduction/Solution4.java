package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Solution4 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");


        Cat myCat = context.getBean("myPet", Cat.class);
        myCat.say();

        context.close();



    }


}
