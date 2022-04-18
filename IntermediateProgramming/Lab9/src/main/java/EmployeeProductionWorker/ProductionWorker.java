/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeeProductionWorker;

/**
 *
 * @author sam13
 */
public class ProductionWorker extends Employee {
    private int shift;
    private double hourlyPay;
    
    public ProductionWorker(int shift, double hourlyPay){
        super("employeeName", "employeeNumber", "hireDate");
        shift = 0;
        hourlyPay = 0;
    }

    public void isDayorNight(int shift){
        if (shift == 0){
            System.out.println("The employee is on night shift");
        }
        else if(shift == 1){
            System.out.println("The employee is on night shift");
        }
        
    }
    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public ProductionWorker(){
        super();
        shift = 0;
        hourlyPay = 0;
    }

    
}
