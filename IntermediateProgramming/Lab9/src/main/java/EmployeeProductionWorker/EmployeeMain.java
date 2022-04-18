/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EmployeeProductionWorker;
import java.util.Scanner;
/**
 *
 * @author sam13
 */
public class EmployeeMain {

    public static void main(String[] args) {
        ProductionWorker productionWorker1 = new ProductionWorker();
        productionWorker1.setHourlyPay(15);

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Is the employee on day or night shift?");

        String shift = keyboard.nextLine();
        

    }
    
}
