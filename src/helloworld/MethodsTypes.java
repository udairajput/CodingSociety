/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author Mateusz
 */
public class MethodsTypes {
    public static void main(String[]args){
        //helloMethod();
               
        //String returnedString = helloMethodWithReturn();
        //System.out.println(returnedString);
        
        System.out.println(integerMethod(3));
        
    }
    
    public static int integerMethod(int i){
       int j = i+2;
       return j;
    }
    
    public static String helloMethodWithReturn(){
        return "Hello";
    }
    
    public static void helloMethod(){
        System.out.println("Hello");
    }
    
}
