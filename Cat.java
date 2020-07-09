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
public class Cat extends Animal{
    
    
    public Cat(String newName) 
    {
      super(newName);
    }
    
    public void introduceYourself() 
    {
        System.out.println("Meow, I am a cat. My name is" + this.name + ",");
        System.out.println("and I am" + this.age + "years.old");
    }
}
