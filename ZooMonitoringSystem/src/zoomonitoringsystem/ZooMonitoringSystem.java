
package zoomonitoringsystem;

/**
 * Program: Zoo keeper monitor
 * Author: John Lain
 * Course: IT-145
 * 
 * Enhancement Two
 * Author: John Lain
 * Date: 11/19/2021
 * 
 * Enhancement description:
 * 
 * For the data structures and algorithms requirement of the CS Capstone project,
 * I added a username and password requirement. This identifies the security
 * component of the 5 course outcomes. I added images to the pop up windows. I 
 * added two more animals to the menu selection class, as well as added clear and 
 * concise comments. I added two more case statements to accommodate the two new
 * animals (Gorilla and Rhino). In addition, I added a while loop that lets the 
 * user continue until they elect to quit the program. 
 * 
 */

// Import Java classes
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
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
        // Initialize variables
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
        
        // Setup default username and password
        String userName = "user";
        String passWord = "1234";
        // Initialize variables
        String userNameEntry = "";
        String passWordEntry = "";
        
        // Prompt Operator for a username
        System.out.println("Enter username: ");
        // Get user input as a string
        userNameEntry = scnr.nextLine();
        
        // User username verification. Keep prompting user if incorrect
        while (!userNameEntry.equals(userName)) {
            System.out.println("Incorrect username. Re-enter username: ");
            // Get user input as a string
            userNameEntry = scnr.nextLine();
        }
        
         // Prompt Operator for a password
        System.out.println("Enter password: ");
        // Get user input as a string
        passWordEntry = scnr.nextLine();
        
        // User password verification. Keep prompting user if incorrect
        while (!passWordEntry.equals(passWord)) {
            System.out.println("Incorrect password. Re-enter password: ");
            // Get user input as a string
            passWordEntry = scnr.nextLine();
        }
        
        // Adds a new line
        System.out.println();
        
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
        UserPrompts headerSection8 = new UserPrompts();
        UserPrompts headerSection9 = new UserPrompts();
        
        // Loop until user dooesn't select y or Y
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
        System.out.println();
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
        // Create the file stream objects
        fileByteStream = new FileInputStream(fileName);
        inFS = new Scanner(fileByteStream);
        
        // Create a new array
        ArrayList<String> fileArray = new ArrayList<>();
        
        // Read in the contents of the file and store in array
        while(inFS.hasNextLine()){
            fileEntry = inFS.nextLine();
            fileArray.add(fileEntry);
        }
        
        // Close the file stream session; folder contents are stored in array
        fileByteStream.close();
        
        // Display the available options based on the Boolean flags condition
        if(animals == true){
            for(int i = 0; i < 6; ++i){
                System.out.println(i + 1 + ". " + fileArray.get(i)); 
            }
            System.out.println("7. Exit");
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
            while(userSelection.getUserChoice() < 1 || userSelection.getUserChoice() > 7){
            System.out.print(userPrompt5.getUserPrompt5());
            userOption = scnr.nextInt();
            userSelection.SetuserChoice(userOption);
            }
            System.out.println();
        }
        // User input validation
        else if(habitat == true){
            while(userSelection.getUserChoice() < 1 || userSelection.getUserChoice() > 4){
            System.out.print(userPrompt4.getUserPrompt4());
            userOption = scnr.nextInt();
            userSelection.SetuserChoice(userOption);
            }
            System.out.println();
        }
          
        // Get the size of the array
        arraySize = fileArray.size();
        
        // Brance here if animals was selected
        if(animals == true){
            switch(userSelection.getUserChoice()){
                // Animal == Lion
                case 1:
                    // Create a new image object
                    ImageIcon lion = new ImageIcon("src\\zoomonitoringsystem\\Images\\Lion.jpg");
                    // Display the Image
                    JOptionPane.showMessageDialog(jf, "", "Meet Leo the Lion", JOptionPane.INFORMATION_MESSAGE, lion);
                    // Loop through array contents
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
                              else {
                                   // If no asterisks found print to the display
                                   System.out.println(fileArray.get(i)); 
                              }
                           }
                        }
                    }
                     break;
                // Animal == Tiger
                case 2:
                    // Create a new image object
                    ImageIcon tiger = new ImageIcon("src\\zoomonitoringsystem\\Images\\Tiger.jpg");
                    // Display the Image
                    JOptionPane.showMessageDialog(jf, "", "Meet Maj the Tiger", JOptionPane.INFORMATION_MESSAGE, tiger);
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
                // Animal == Bear      
                case 3:
                    // Create a new image object
                    ImageIcon bear = new ImageIcon("src\\zoomonitoringsystem\\Images\\Bear.jpg");
                    // Display the Image
                    JOptionPane.showMessageDialog(jf, "", "Meet Baloo the Bear", JOptionPane.INFORMATION_MESSAGE, bear);
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
                // Animal == Giraffe     
                case 4:
                    // Create a new image object
                    ImageIcon giraffe = new ImageIcon("src\\zoomonitoringsystem\\Images\\Giraffe.jpg");
                    // Display the Image
                    JOptionPane.showMessageDialog(jf, "", "Meet Spots the Giraffe", JOptionPane.INFORMATION_MESSAGE, giraffe);
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
                // Animal == Gorilla
                case 5:
                    // Create a new image object
                    ImageIcon gorilla = new ImageIcon("src\\zoomonitoringsystem\\Images\\Gorilla.jpg");
                    // Display the Image
                    JOptionPane.showMessageDialog(jf, "", "Meet Kong the Gorilla", JOptionPane.INFORMATION_MESSAGE, gorilla);
                    for(int i = 0; i < arraySize; ++i){
                       if(fileArray.get(i).contains(headerSection5.getSectionHeader5())){
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
                // Animal == Rhino
                case 6:
                    // Create a new image object
                    ImageIcon rhino = new ImageIcon("src\\zoomonitoringsystem\\Images\\Rhino.jpg");
                    // Display the Image
                    JOptionPane.showMessageDialog(jf, "", "Meet Betsy the Rhino", JOptionPane.INFORMATION_MESSAGE, rhino);
                    for(int i = 0; i < arraySize; ++i){
                       if(fileArray.get(i).contains(headerSection6.getSectionHeader6())){
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
                // The user wishes to exit
                case 7:
                    System.exit(0);
                    break;
                // Always have a default case
                default:
                    break;
            }
        }
        // Branch here if habitat was selected
        if(habitat == true){
            switch(userSelection.getUserChoice()){
                // Habitat == Penguin Habitat
                case 1:
                    // Create a new image object
                    ImageIcon penguin = new ImageIcon("src\\zoomonitoringsystem\\Images\\PenguinHabitat.jpg");
                    // Display the Image
                    JOptionPane.showMessageDialog(jf, "", "Penguin Habitat", JOptionPane.INFORMATION_MESSAGE, penguin);
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
                // Habitat == Bird House
                case 2:
                     // Create a new image object
                     ImageIcon bird = new ImageIcon("src\\zoomonitoringsystem\\Images\\BirdHouse.jpg");
                     // Display the Image
                     JOptionPane.showMessageDialog(jf, "", "Bird House Habitat", JOptionPane.INFORMATION_MESSAGE, bird);
                    for(int i = 0; i < arraySize; ++i){
                       if(fileArray.get(i).contains(headerSection8.getSectionHeader8())){
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
                // Habitat == Aquarium Habitat     
                case 3:
                    // Create a new image object
                    ImageIcon aquarium = new ImageIcon("src\\zoomonitoringsystem\\Images\\Aquarium.jpg");
                    // Display the Image
                    JOptionPane.showMessageDialog(jf, "", "Aquarium Habitat", JOptionPane.INFORMATION_MESSAGE, aquarium);
                    for(int i = 0; i < arraySize; ++i){
                       if(fileArray.get(i).contains(headerSection9.getSectionHeader9())){
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
                // The user wishes to exit
                case 4:
                    System.exit(0);
                    break;
                // Always have a default case
                default:
                    break;
            }
        }
        // Prompt the user to continus or quit
        System.out.print("\n");
        System.out.print("Would you like to return to the main menu? ");
        System.out.print("Enter y to continue or any other key to quit: ");
        // Get the user's choice
        userChoice = scnr.next();
        System.out.println();
        // Set variable with the user's choice
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

        
        

    
    

