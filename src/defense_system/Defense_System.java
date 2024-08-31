/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package defense_system;

/**
 *
 * @author pc
 */
public class Defense_System {
    
    public static void main(String[] args) {
        Observable observable = new Observable();
        
        observable.addTroup(new MainController(observable));
    }
    
}
