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
public class JavaLoops {

    public static void main(String[] args) {

//        
//        String world = "hello ";
//                String hello = "world";
//                String[] stringBox = new String[3];
//                stringBox[0] = "this ";
//                stringBox[1] = world;
//                stringBox[2] = hello;
//        int j = 20;
//        while (j==20) {
//
//            System.out.println(j);
//            
//        }
        
//        for(int i = 20;i>0;i--){
//            System.out.println(i);
//        }
//        System.out.println(stringBox[0]);
//        System.out.println(stringBox[1]);
//        System.out.println(stringBox[2]);
//        
        String world = "hello ";
                String hello = "world";
                String[] stringBox = new String[3];
                stringBox[0] = "this ";
                stringBox[1] = world;
                stringBox[2] = hello;
        for(String text : stringBox){
            System.out.println(text);
        }
        for(int i=0;i<stringBox.length;i++){
            System.out.println(stringBox[i]);
        }
//        
//        
    }

}
