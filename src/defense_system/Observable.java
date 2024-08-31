/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defense_system;

import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class Observable {

    ArrayList<Observer> observers = new ArrayList<>();

    public void addTroup(Observer Observer) {
        observers.add(Observer);
    }

    public void setStrangth(int Stranghth) {
        for (Observer observer : observers) {
            observer.updateCommands(Stranghth);
        }
    }

    public void DisplayAreaClear(String AreaUpdate) {
        System.out.println(AreaUpdate);
        for (Observer observer : observers) {
            observer.updateAreaClear(AreaUpdate);
        }
    }

    public void DisplayControllUniteMessages(String Name, String message) {
        if (Name == "Controll Unit") {
            for (Observer observer : observers) {
                observer.updateMessages(Name, message);
            }
        }
    }

    public void DisplayTroup(String Name, String message) {
        for (Observer observer : observers) {
            observer.updateTroupMessages(Name, message);
        }
    }
    
    public void DisplayPrivateMessage(String user,String Name, String message) {
        for (Observer observer : observers) {
            observer.updatePrivateMessages(user,Name, message);
        }
    }

}
