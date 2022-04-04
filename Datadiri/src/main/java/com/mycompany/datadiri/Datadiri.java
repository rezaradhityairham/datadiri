/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.datadiri;

import java.util.jar.Attributes.Name;

/**
 *
 * @author rezar
 */
public class Datadiri {
    int Umur;
    
    /**
     *
     * @param name
     */
    public Datadiri(String name){
        //This constructor has one paramete,name.
        System.out.printIn("Name chosen is : " + name);
    }
    public void setUmur(int umur){
        Umur = umur;
        }
    public int getUmur( ) {
        System.out.printIn("Umur    :" + Umur)
        return Umur;
    }
    
    public static void main(String[] args) {
     /*Object Creation*/
      nama =new User("Reza Radhitya Irham");
    
     /* Call class method to set puppy's age */
      User.setUmur( 18 );

      /* Call another class method to get puppy's age */
      User.getUmur( );

      /* You can access instance variable as follows as well */
      System.out.println("Variable Value :" + User.Umur );
   }
    }
}
