/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package defense_system;

/**
 *
 * @author pc
 */
public interface Observer {
    public void updateCommands(int Stranghth);
    public void updateAreaClear(String AreaUpdate);
    public void updateMessages(String Name,String AreaUpdate);
    public void updateTroupMessages(String Name,String AreaUpdate);
    public void updatePrivateMessages(String user,String Name,String message);
}
