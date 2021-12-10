
package zoomonitoringsystem;

/**
 * Program: Zoo keeper monitor
 * Author: John Lain
 * Course: IT-145
 */

public class ZooMonitoringSystemUserPrompts {
    
    private String userPrompt1;
    private String userPrompt2;
    private String userPrompt3;
    private String userPrompt4;
    private String userPrompt5;
    private String sectionHeader1;
    private String sectionHeader2;
    private String sectionHeader3;
    private String sectionHeader4;
    private String sectionHeader5;
    private String sectionHeader6;
    private String sectionHeader7;
    
    public ZooMonitoringSystemUserPrompts() {
        
        this.userPrompt1 = "What would you like to monitor?\n";
        this.userPrompt2 = "Enter an option. For example 1: ";
        this.userPrompt3 = "Enter a valid option(1 to 3): ";
        this.userPrompt4 = "Enter a valid option( 1 to 4): ";
        this.userPrompt5 = "Enter a valid option( 1 to 5): ";
        this.sectionHeader1 = "Animal - Lion";
        this.sectionHeader2 = "Animal - Tiger";
        this.sectionHeader3 = "Animal - Bear";
        this.sectionHeader4 = "Animal - Giraffe";
        this.sectionHeader5 = "Habitat - Penguin";
        this.sectionHeader6 = "Habitat - Bird";
        this.sectionHeader7 = "Habitat - Aquarium";
    }
    
    public ZooMonitoringSystemUserPrompts(String userPrompt1, String userPrompt2, String userPrompt3,
            String userPrompt4, String userPrompt5, String sectionHeader1, String sectionHeader2, String sectionHeader3, 
            String sectionHeader4, String sectionHeader5, String sectionHeader6, String sectionHeader7) {
        
        this.userPrompt1 = userPrompt1;
        this.userPrompt2 = userPrompt2;
        this.userPrompt3 = userPrompt3;
        this.userPrompt4 = userPrompt4;
        this.userPrompt4 = userPrompt5;
        this.sectionHeader1 = sectionHeader1;
        this.sectionHeader2 = sectionHeader2;
        this.sectionHeader3 = sectionHeader3;
        this.sectionHeader4 = sectionHeader4;
        this.sectionHeader5 = sectionHeader5;
        this.sectionHeader6 = sectionHeader6;
        this.sectionHeader7 = sectionHeader7;
        
    }
    // Utilize setters and getters as methods
    public String getUserPrompt1(){
        return userPrompt1;
    }
    
    public void setUserPrompt1(String userPrompt1){
        this.userPrompt1 = userPrompt1;
    }
    
     public String getUserPrompt2(){
        return userPrompt2;
    }
    
    public void setUserPrompt2(String userPrompt2){
        this.userPrompt2 = userPrompt2;
    }
    
     public String getUserPrompt3(){
        return userPrompt3;
    }
    
    public void setUserPrompt3(String userPrompt3){
        this.userPrompt3 = userPrompt3;
    }
    
     public String getUserPrompt4(){
        return userPrompt4;
    }
    
    public void setUserPrompt4(String userPrompt4){
        this.userPrompt4 = userPrompt4;
    }
    
    public String getUserPrompt5(){
        return userPrompt5;
    }
    
    public void setUserPrompt5(String userPrompt5){
        this.userPrompt5 = userPrompt5;
    }
    
     public String getSectionHeader1(){
        return sectionHeader1;
    }
    
    public void setSectionHeader1(String sectionHeader1){
        this.sectionHeader1 = sectionHeader1;
    }
    
    public String getSectionHeader2(){
        return sectionHeader2;
    }
    
    public void setSectionHeader2(String sectionHeader2){
        this.sectionHeader2 = sectionHeader2;
    }
    
    public String getSectionHeader3(){
        return sectionHeader3;
    }
    
    public void setSectionHeader3(String sectionHeader3){
        this.sectionHeader3 = sectionHeader3;
    }
    
    public String getSectionHeader4(){
        return sectionHeader4;
    }
    
    public void setSectionHeader4(String sectionHeader4){
        this.sectionHeader4 = sectionHeader4;
    }
    
    public String getSectionHeader5(){
        return sectionHeader5;
    }
    
    public void setSectionHeader5(String sectionHeader5){
        this.sectionHeader5 = sectionHeader5;
    }
    
    public String getSectionHeader6(){
        return sectionHeader6;
    }
    
    public void setSectionHeader6(String sectionHeader6){
        this.sectionHeader6 = sectionHeader6;
    }
    
    public String getSectionHeader7(){
        return sectionHeader7;
    }
    
    public void setSectionHeader7(String sectionHeader7){
        this.sectionHeader7 = sectionHeader7;
    }
}


    
