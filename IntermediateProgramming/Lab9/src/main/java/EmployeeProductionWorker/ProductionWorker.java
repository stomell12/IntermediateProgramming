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
    private String shiftTextString;
    private double hourlyPay;
    //private double wage;

    public ProductionWorker() {
    }
    
    public ProductionWorker(int shift, double hourlyPay){
        super("employeeName", "employeeNumber", "hireDate");
        shift = 0;
        hourlyPay = 15;
    }

    //public double dailyWage(double hourlyPay){
       //this.wage = hourlyPay * 8;

       //return wage;
    //}


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

    public ProductionWorker(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public String getShiftTextString() {
        return shiftTextString;
    }

    public void setShiftTextString(String shiftTextString) {
        this.shiftTextString = shiftTextString;
    }


    
}
