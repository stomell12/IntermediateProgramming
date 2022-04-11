/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lab8;

import java.util.Scanner;

/**
 *
 * @author sam13
 */
public class MainLand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        LandTract myLandTract1 = new LandTract(0,0);
        LandTract myLandTract2 = new LandTract(0,0);

        System.out.println("Please input the length of the first land tract");
        myLandTract1.setLength(keyboard.nextInt());

        System.out.println("Please input the width of the first land tract");
        myLandTract1.setWidth(keyboard.nextInt());

        System.out.println("Please input the length of the second land tract");
        myLandTract2.setLength(keyboard.nextInt());

        System.out.println("Please input the width of the second land tract");
        myLandTract2.setWidth(keyboard.nextInt());

        //Prints land tract area;
        System.out.println(myLandTract1.toString());
        System.out.println(myLandTract2.toString());

        if (myLandTract1.equals(myLandTract2))
            System.out.println("The two tracts are equally sized");
        else
            System.out.println("The two tracts are different sizes");

    }
}
