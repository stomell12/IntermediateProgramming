/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Students;

/**
 *
 * @author sam13
 */
public class GraduateStudent extends Student{
    private String type;

    public GraduateStudent(String type) {
        super("StudentID", "firstName", "lastName");
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

}
