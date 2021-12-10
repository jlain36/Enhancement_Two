
package zoomonitoringsystem;

/**
 * Program: Zoo keeper monitor
 * Author: John Lain
 * Course: IT-145
 */

// Import Java classes
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class ZooMonitoringSystem extends ZooMonitoringSystemMenu {
    
    // Java doesn't support multiple inheritance; this is a workaround
    private static class UserPrompts extends ZooMonitoringSystemUserPrompts {
        
    }
        
    public static void main(String[] args) throws IOException{
        FileInputStream fileByteStream = null;
        Scanner inFS = null;
        // Create a new scanner object
        Scanner scnr = new Scanner(System.in);
        String fileName = "";
        String fileEntry = "";
        Boolean animals = false;
        Boolean habitat = false;
        int userOption = 0;
        int arraySize = 0;
        int foundIndex = 0;
        
        // Initialize userChoice to "y" to enter while loop for the first time
        String userChoice = "y";
        String foundCharString = "";
        
        // Create a new object. Set popup to be the top focus always
        JFrame jf = new JFrame();
        jf.setAlwaysOnTop(true);
        
        // Create new objects from the ZooMonitoringSystemMenu class 
        ZooMonitoringSystemMenu userSelection = new ZooMonitoringSystemMenu();
        ZooMonitoringSystemMenu menuItem1 = new ZooMonitoringSystemMenu();
        ZooMonitoringSystemMenu menuItem2 = new ZooMonitoringSystemMenu();
        ZooMonitoringSystemMenu menuItem3 = new ZooMonitoringSystemMenu();
        ZooMonitoringSystemMenu stringVar = new ZooMonitoringSystemMenu();
        
        // Create new objects from the ZooMonitoringSystemUserPrompts class 
        UserPrompts userPrompt1 = new UserPrompts();
        UserPrompts userPrompt2 = new UserPrompts();
        UserPrompts userPrompt3 = new UserPrompts();
        UserPrompts userPrompt4 = new UserPrompts();
        UserPrompts userPrompt5 = new UserPrompts();
        UserPrompts headerSection1 = new UserPrompts();
        UserPrompts headerSection2 = new UserPrompts();
        UserPrompts headerSection3 = new UserPrompts();
        UserPrompts headerSection4 = new UserPrompts();
        UserPrompts headerSection5 = new UserPrompts();
        UserPrompts headerSection6 = new UserPrompts();
        UserPrompts headerSection7 = new UserPrompts();
        
        stringVar.setStringVar(userChoice);
        while(userChoice.equalsIgnoreCase("y")){
        System.out.print(userPrompt1.getUserPrompt1());
        System.out.println("1. " + menuItem1.getMenuItem1());
        System.out.println("2. " + menuItem2.getMenuItem2());
        System.out.println("3. " + menuItem3.getMenuItem3() + "\n");
        
        // Get user input
        System.out.print(userPrompt2.getUserPrompt2());
        userOption = scnr.nextInt();
        userSelection.SetuserChoice(userOption);
        
        // User input validation; always get legitimate user input
        while(userSelection.getUserChoice() < 1 || userSelection.getUserChoice() > 3){
            System.out.print(userPrompt3.getUserPrompt3());
            userOption = scnr.nextInt();
            userSelection.SetuserChoice(userOption);
        }
        // Use the user input to select the correct text file
        switch(userSelection.getUserChoice()){
            case 1:
                fileName = menuItem1.getMenuItem1() + ".txt";
                // Set Boolean flag if case 1 executes
                // This flag is used for conditional statements to follow
                animals = true;
                break;
            case 2:
                fileName = menuItem2.getMenuItem2() + ".txt";
                // Set Boolean flag if case 2 executes
                // This flag is used for conditional statements to follow
                habitat = true;
                break;
            case 3:
                // Exit the program if case 3 executes
                System.exit(0);
                break;
            default:
                break; 
        }
        // Invoke the file stream class, scanner class, and an dynamic array class
        fileByteStream = new FileInputStream(fileName);
        inFS = new Scanner(fileByteStream);
        ArrayList<String> fileArray = new ArrayList<String>();
        
        // Read in the contents of the file and store in array
        while(inFS.hasNextLine()){
            fileEntry = inFS.nextLine();
            fileArray.add(fileEntry);
        }
        // Close the file stream session; folder contents are stored in array
        fileByteStream.close();
        
        // Display the available options based on the flags condition
        if(animals == true){
            for(int i = 0; i < 4; ++i){
                System.out.println(i + 1 + ". " + fileArray.get(i)); 
            }
            System.out.println("5. Exit");
        }
        else if(habitat == true){
            for(int i = 0; i < 3; ++i){
                System.out.println(i + 1 + ". " + fileArray.get(i));
            }
            System.out.println("4. Exit");
        }
        // Get user input
        System.out.print("\n");
        System.out.print(userPrompt2.getUserPrompt2());
        userOption = scnr.nextInt();
        userSelection.SetuserChoice(userOption);
        
        // User input validation
        if(animals == true){
            while(userSelection.getUserChoice() < 1 || userSelection.getUserChoice() > 5){
            System.out.print(userPrompt5.getUserPrompt5());
            userOption = scnr.nextInt();
            userSelection.SetuserChoice(userOption);
            }
        }
        else if(habitat == true){
            while(userSelection.getUserChoice() < 1 || userSelection.getUserChoice() > 4){
            System.out.print(userPrompt4.getUserPrompt4());
            userOption = scnr.nextInt();
            userSelection.SetuserChoice(userOption);
            }
        }
        System.out.print("\n");
        
        // Get the size of the array
        arraySize = fileArray.size();
        
        if(animals == true){
            switch(userSelection.getUserChoice()){
                case 1:
                    for(int i = 0; i < arraySize; ++i){
                       if(fileArray.get(i).contains(headerSection1.getSectionHeader1())){
                           foundIndex = i;
                           for(i = foundIndex; i <= foundIndex + 4; i++){
                              if(fileArray.get(i).contains("*")){
                                   foundCharString = fileArray.get(i);
                                   // Replace asterisks with empty string value
                                   foundCharString = foundCharString.replace("*", "");
                                   // Show the warning popup dialog box
                                   JOptionPane.showConfirmDialog(jf,foundCharString, "WARNING!",
                                   // The default option just shows an OK button
                                   JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);    
                              }
                              else{
                                 // If no asterisks found print to the display
                                 System.out.println(fileArray.get(i)); 
                              } 
                           }
                        }
                    }
                     break;
                case 2:
                    for(int i = 0; i < arraySize; ++i){
                       if(fileArray.get(i).contains(headerSection2.getSectionHeader2())){
                           foundIndex = i;
                           for(i = foundIndex; i <= foundIndex + 4; i++){
                               if(fileArray.get(i).contains("*")){
                                   foundCharString = fileArray.get(i);
                                   foundCharString = foundCharString.replace("*", "");
                                   JOptionPane.showConfirmDialog(jf,foundCharString, "WARNING!",
                                   JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
                               }
                               else{
                                   System.out.println(fileArray.get(i)); 
                               } 
                            }
                         }
                     }
                      break;
                case 3:
                    for(int i = 0; i < arraySize; ++i){
                       if(fileArray.get(i).contains(headerSection3.getSectionHeader3())){
                           foundIndex = i;
                           for(i = foundIndex; i <= foundIndex + 4; i++){
                              if(fileArray.get(i).contains("*")){
                                   foundCharString = fileArray.get(i);
                                   foundCharString = foundCharString.replace("*", "");
                                   JOptionPane.showConfirmDialog(jf,foundCharString, "WARNING!",
                                   JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
                              }
                              else{
                                  System.out.println(fileArray.get(i)); 
                              } 
                           }
                        }
                    }
                     break;
                case 4:
                    for(int i = 0; i < arraySize; ++i){
                       if(fileArray.get(i).contains(headerSection4.getSectionHeader4())){
                           foundIndex = i;
                           for(i = foundIndex; i <= foundIndex + 4; i++){
                              if(fileArray.get(i).contains("*")){
                                   foundCharString = fileArray.get(i);
                                   foundCharString = foundCharString.replace("*", "");
                                   JOptionPane.showConfirmDialog(jf,foundCharString, "WARNING!",
                                   JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
                              }
                              else{
                                  System.out.println(fileArray.get(i)); 
                              } 
                           }
                        }
                    }
                     break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
        if(habitat == true){
            switch(userSelection.getUserChoice()){
                case 1:
                    for(int i = 0; i < arraySize; ++i){
                       if(fileArray.get(i).contains(headerSection5.getSectionHeader5())){
                           foundIndex = i;
                           for(i = foundIndex; i < foundIndex + 4; i++){
                               if(fileArray.get(i).contains("*")){
                                   foundCharString = fileArray.get(i);
                                   foundCharString = foundCharString.replace("*", "");
                                   JOptionPane.showConfirmDialog(jf,foundCharString, "WARNING!",
                                   JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
                               }
                               else{
                                   System.out.println(fileArray.get(i)); 
                               } 
                           }
                        }
                    }
                     break;
                case 2:
                    for(int i = 0; i < arraySize; ++i){
                       if(fileArray.get(i).contains(headerSection6.getSectionHeader6())){
                           foundIndex = i;
                           for(i = foundIndex; i < foundIndex + 4; i++){
                             if(fileArray.get(i).contains("*")){
                                   foundCharString = fileArray.get(i);
                                   foundCharString = foundCharString.replace("*", "");
                                   JOptionPane.showConfirmDialog(jf,foundCharString, "WARNING!",
                                   JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
                              }
                              else{
                                  System.out.println(fileArray.get(i)); 
                              } 
                           }
                        }
                    }
                     break;
                case 3:
                    for(int i = 0; i < arraySize; ++i){
                       if(fileArray.get(i).contains(headerSection7.getSectionHeader7())){
                           foundIndex = i;
                           for(i = foundIndex; i < foundIndex + 4; i++){
                              if(fileArray.get(i).contains("*")){
                                   foundCharString = fileArray.get(i);
                                   foundCharString = foundCharString.replace("*", "");
                                   JOptionPane.showConfirmDialog(jf,foundCharString, "WARNING!",
                                   JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
                              }
                              else{
                                  System.out.println(fileArray.get(i)); 
                              } 
                           }
                        }
                    }
                     break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
        // Prompt the user to continus or quit
        System.out.print("\n");
        System.out.print("Would you like to return to the main menu? ");
        System.out.print("Enter y to continue or any other key to quit: ");
        userChoice = scnr.next();
        stringVar.setStringVar(userChoice);
        
        // If the user enters y or Y; loop
        if (stringVar.getStringVar().equalsIgnoreCase("y")){
            // Re-initialize the Boolean flags for the next loop iteration
            animals = false;
            habitat = false;
        }  
        // If the user enters anything other than y or Y: exit the program 
        else{   
           System.exit(0);    
        }
        }
    }
}

        
        

    
    

