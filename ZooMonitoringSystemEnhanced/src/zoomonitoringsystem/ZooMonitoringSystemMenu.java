
package zoomonitoringsystem;

/**
 * Program: Zoo keeper monitor
 * Author: John Lain
 * Course: IT-145
 */

public class ZooMonitoringSystemMenu {
    
    private int userChoice;
    private String menuItem1;
    private String menuItem2;
    private String menuItem3;
    private String stringVar;
    
    // Constructor
    public ZooMonitoringSystemMenu(){
        
        this.userChoice = 0;
        this.menuItem1 = "Animals";
        this.menuItem2 = "Habitat";
        this.menuItem3 = "Exit";
        this.stringVar = "";
    }
    
    public ZooMonitoringSystemMenu(int userChoice, String menuItem1, String menuItem2, String menuItem3, String stringVar){
   
        this.userChoice = userChoice;
        this.menuItem1 = menuItem1;
        this.menuItem2 = menuItem2;
        this.menuItem3 = menuItem3;
        this.stringVar = stringVar;
    }  
    // Utilize setters and getters as methods
     public int getUserChoice(){
        return userChoice;
    }
    
    public void SetuserChoice(int userChoice){
        this.userChoice = userChoice;
    }
    
    public String getMenuItem1(){
        return menuItem1;
    }
    
    public void setMenuItem1(String menuItem1){
        this.menuItem1 = menuItem1;
    }
    
    public String getMenuItem2(){
        return menuItem2;
    }
    
    public void setMenuItem2(String menuItem2){
        this.menuItem2 = menuItem2;
    }
    
    public String getMenuItem3(){
        return menuItem3;
    }
    
    public void setMenuItem3(String menuItem3){
        this.menuItem3 = menuItem3;
    }
    
    public String getStringVar(){
        return stringVar;
    }
    
    public void setStringVar(String stringVar){
        this.stringVar = stringVar;
    }
}


     
    
    

