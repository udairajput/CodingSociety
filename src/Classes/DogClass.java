/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Mateusz
 */
public class DogClass {
    
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.setName("Max");
        dog.setAge(5);
        dog.setBreed("Terrier");
        dog.setChipNumber(987);
        dog.setWeight(7.6);
        dog.setGender('m');
        
        Dog dog1 = new Dog();
        dog1.setName("Steve");
        
        Dog dog2 = new Dog();
        
        Dog dog3 = new Dog("Bob",' ',6.7,"Terrier",987,5);
        
             System.out.println("name "+dog.getName());   
             System.out.println("name"+dog1.getName());
             System.out.println("name "+ dog2.getName());
             System.out.println("name "+dog3.getName());
       // dog.printDogDetails();
    }    
    
}
