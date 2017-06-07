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
/*
This is a comment
 */
//this is single line com
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int test = 90;


        
        
        switch (test) {
            case 0:
                String world = "hello ";
                String hello = "world";
                String[] stringBox = new String[3];
                stringBox[1] = world;
                stringBox[2] = hello;
                System.out.println(stringBox[1] + stringBox[2]);
                break;
            case 1:
                int[] intBox = new int[2];
                intBox[0] = 1;
                intBox[1] = 2;
                System.out.println(intBox[0] + intBox[1]);
                break;
                default:
                    System.out.println("Other");
                    break;
                    
        }
        if (test == 0) {

        } else if (test == 1) {

        } else {
            
        }

    }

}
