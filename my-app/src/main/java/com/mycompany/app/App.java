package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Animal dog = new Dog();
        dog.eat();
        Animal cat = new Cat();
        cat.eat();
    }
}
