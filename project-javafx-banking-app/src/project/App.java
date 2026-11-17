/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;


import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 *
 * @author bmami
 */

/**
 * Overview:
 * 
 * The responsibilities this class has are managing the main application flow for the login,
 * setting up the primary stage, and creating and displaying the login stage.
 * 
 * It extends the JavaFX Application class and initializes the login stage upon application startup.
 * 
 * This class is mutable because it maintains state through the loginScene field, which can be modified.
 * 
 * The abstraction function is:
 * 
 * AF(loginScene) = {loginScene} 
 *      the class initializes the primary stage then manages the login scene that is 
 *      shown to the customer/manager
 * 
 * The Rep Invariant is:
 * 
 *      loginScene != NULL
 * 
 * 
 */
public class App extends Application {
    
    private Scene loginScene;
    
    
    /**
     * REQUIRES: primaryStage != null
     * MODIFIES: loginScene, primaryStage
     * EFFECTS: Initializes the GUI for the application and displays the login scene on the primary stage.
     */
    
    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Bank Login");
        
        LoginStage login = new LoginStage (primaryStage);
        loginScene = login.getScene();
        
        primaryStage.setScene(loginScene);
        primaryStage.show();
        
    }
    

    /**
     * REQUIRES: None
     * MODIFIES: None
     * EFFECTS: Launches the application through the launch method and the args parameter is 
     *          passed containing command-line arguments passed to the program when it's executed.
     */
    
    public static void main(String[] args){
        
        
        //Check the toString() method
        //System.out.println("toString() result: " + toString());

        // Check the repOk() method
        //System.out.println("repOk() result: " + repOk(loginScreen));
        launch(args);
    }
    
    /**
     * Returns a string representation of the object.
     * This method serves as the abstraction function for the App class.
     * It provides a high-level description of the object's state.
     *
     * @return A string representation of the App object.
     */
    @Override
    public String toString() {
        return "App: This class represents the main application of the bank login system.";
    }
    
    /*
    * REQUIRES: None
    * MODIFIES: None
    * EFFECTS: Returns true if rep invariant holds, else returns false
    */
     public boolean repOk(){
        if(loginScene != null){
            return false;
        }
        else{
            return true;
        }
    }
     
     
}
