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
        employee emp1 = new employee("Jumayca",1200000 , "engineering", 100000.00);
        employee emp2 = new employee("Naldrelle",73800, "Nyahhhh",6150.50 );
        employee emp3 = new employee("Michaela", 108000, "Unsa akong password",9000.01);

        emp1.DisplayEmployeeInfo();
        System.out.println("");
        emp2.DisplayEmployeeInfo();
        System.out.println("");
        emp3.DisplayEmployeeInfo();
        System.out.println("");
    }
}
