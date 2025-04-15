package com.ant;

import org.springframework.beans.factory.config.BeanDefinitionCustomizer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot parrot = context.getBean(Parrot.class);
        System.out.println("parrot bean => " + parrot.getName());

        Parrot getParrotByName = context.getBean("parrot2", Parrot.class);
        System.out.println("parrot bean => " + getParrotByName.getName());

        Integer ten = context.getBean(Integer.class);
        System.out.println("Integer bean => " + ten);

        String hello = context.getBean(String.class);
        System.out.println("String bean => " + hello);

        Cat cat = context.getBean(Cat.class);
        System.out.println("parrot bean => " + cat.getName());

        // add bean to spring context in programmatic way
        // ==== start ===
        // create instance
        Dog dog = new Dog();
        dog.setName("programmatic dog");
        dog.setColor("programmatic color");
        // create supplier
        Supplier<Dog> dogSupplier = () -> dog;
        // create bean definition customizer make it primary
        BeanDefinitionCustomizer beanDefinition = (bc) -> bc.setPrimary(true);

        // add bean to context
        context.registerBean("dog", Dog.class, dogSupplier, beanDefinition);
        // get bean from context
        Dog dogBean = context.getBean(Dog.class);
        System.out.println("dog bean => " + dogBean.getName());
        // ==== end ===

        // get all dogs
        // add dogs of type black to spring context
        List<Dog> allDogs = dog.getAllDogs();
        for (Dog d : allDogs) {
            if (d.getColor().equals("Black")) {
                context.registerBean(d.getName(), Dog.class, () -> d);
            }
        }

        Map<String, Dog> dogBeans = context.getBeansOfType(Dog.class);
        System.out.println("=> Dog beans in the context:");
        dogBeans.forEach((beanName, d) -> System.out.println(beanName));
    }
}
