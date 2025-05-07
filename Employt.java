/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package employt;
import java.util.Scanner;
/**
 *
 * @author MANAIT_CpE121
 */
public class Employt {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        employee emp1 = new employee("Lors",0001 , "Mechanical engineering", 100000.00);
        employee emp2 = new employee("Naldrelle",0002, "Electronics Engineering",6150.50 );
        employee emp3 = new employee("Jumicking",0003, "Petrolium Enginerring",9000.01);

        emp1.DisplayEmployeeInfo();
        System.out.println("");
        emp2.DisplayEmployeeInfo();
        System.out.println("");
        emp3.DisplayEmployeeInfo();
        System.out.println("");
    }
}
