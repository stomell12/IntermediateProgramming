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
        System.out.println("EMPLOYEE INFORMATION ENTRY & VIEWING");
        System.out.println("");
        System.out.println("Enter employee name:");
        productionWorker1.setEmployeeName(keyboard.nextLine()); 

        System.out.println("Is the employee on day or night shift?\nEnter 1 for Day, Enter 2 for Night");
        productionWorker1.setShift(keyboard.nextInt()); 
        keyboard.nextLine();        



        System.out.println("Enter employee ID Number\n*Enter as format 000-L");
        productionWorker1.setEmployeeNumber(keyboard.nextLine()); 

        System.out.println("Enter employee hire date");
        productionWorker1.setHireDate(keyboard.nextLine()); 

//Test if day or night
        if (productionWorker1.getShift() == 1){
            productionWorker1.setShiftTextString("Day");
            //this.shiftTextString.equals("Day");
            }
            else if(productionWorker1.getShift() == 2){
                productionWorker1.setShiftTextString("Night");
            }
            else {
                productionWorker1.setShiftTextString("ERR");
        }
        Double wage = productionWorker1.getHourlyPay();

        System.out.println("----------------------------------------------------------------------");
        System.out.printf("%-15s %10s %15s %10s %15s", "|EMP_ID","NAME", "HIREDATE", "SHIFT", "HOURLY PAY  |");
        System.out.println("\n----------------------------------------------------------------------");
        System.out.printf("%-15s %10s %15s %10s %15s", " " + productionWorker1.getEmployeeNumber(), productionWorker1.getEmployeeName(), productionWorker1.getHireDate(), productionWorker1.getShiftTextString(), "$" + wage + "0");
        

        

    }
    
    
}
