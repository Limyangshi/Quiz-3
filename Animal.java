/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1stage1;

/**
 *
 * @author ASUS
 */
public class Animal {
    public String name;
    public int age;
    
    public Animal(String name)
    {
        this.name = name;
    }
    
    public void introduceYourself()
    {
        System.out.println("Meow, I am an animal. My name is" + this.name);
        System.out.println("and i am" + this.age + "years old");
    }
}
