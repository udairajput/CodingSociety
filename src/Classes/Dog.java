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
public class Dog {
       private String name;
       private char gender;
       private int age;
       private String breed;
       //owner
       private int chipNumber;
       private double weight;

       public Dog(){
           
       }
       
    public Dog(String name,char gender,double weight,String breed, int chipNumber,int age) {
        this.name = name;
        this.gender=gender;
        this.weight = weight;
        this.breed=breed;
        this.chipNumber=chipNumber;
        this.age=age;
        
    }

       
       
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public char getGender () {
        return gender;
    }        
    
    public void setGender (char gender) {
        this.gender = gender;
    }
    public int getAge () {
        return age;
    }
    
    public void setAge (int age){
        this.age = age;
    }
    public String getBreed () {
        return breed;  
    }
    public void setBreed (String breed){
        this.breed = breed;
    }
    public int getChipNumber () {
        return chipNumber;
    }
    public void setChipNumber (int chipNumber){
        this.chipNumber = chipNumber;
        
    }
    public void setWeight (double weight){
        this.weight=weight;
        
        
    }
    public double getWeight (){
        return weight;
        
    }
       public void printDogDetails(){
           System.out.println("Name: "+ name +
                   " gender "+gender +
                   " age "+ age+
                   " breed "+breed +
                   " chip Number"+chipNumber +
                   " weight "+ weight);
       }
       
}