/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package phonebook;


/**
 *
 * @author Oliva
 */
public class olivaPhonebook implements emenemsinter {

    public static void main(String[] args) {
        //Initialize Data Structure
        emenemsinter.DB_Initialize();
        //Insert Sample Data
        emenemsinter.addRow("Neale", "Oliva", "10/04/2001", "Tanauan City", "2020009@ub.edu.ph", "09197721710");
        //Initialize GUI
        emenemsmain app = new emenemsmain();
        app.setVisible(true);
        
        
    }
}
