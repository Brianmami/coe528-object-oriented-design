/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;



import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
/**
 *
 * @author bmami
 */

//stage constructor
public class ManagerStage {
   
    //instance variables
    private Scene scene;
    private AccountCreator file;
    private String AccountUsername; 
    
    
    public ManagerStage(Stage primaryStage, AccountCreator file){
        
        //new instance of manager with username, pass, and role
        ManagerClass manager = new ManagerClass("admin", "admin", "manager");
        
        //main Stage
        primaryStage.setTitle("Welcome back, Manager");
        
        GridPane managerPane = new GridPane();
        managerPane.setAlignment(Pos.CENTER_LEFT); // Align all components to the left
        managerPane.setHgap(10); //hori and vert 
        managerPane.setVgap(5);
        managerPane.setPadding(new Insets(10));
        managerPane.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, null, null))); // Set light blue background
        //colour
        
        //logout button
        VBox logout = new VBox(10);
        logout.setAlignment(Pos.CENTER);
        logout.setPadding(new Insets(20));

        //buttons 
        Button addCustomerButton = new Button("Add Customer");
        Button deleteCustomerButton = new Button("Delete Customer");
        Button logoutButton = new Button("Logout");
        
        addCustomerButton.setMinWidth(100);
        deleteCustomerButton.setMinWidth(100);

        //logout button action
        logoutButton.setOnAction(e -> {
            primaryStage.setScene(new LoginStage(primaryStage).getScene());
            primaryStage.setTitle("Bank Application");
        });
        
        //add customer action button
        addCustomerButton.setOnAction(e -> {
            Stage addStage = new Stage();
            addStage.setTitle("Add Customer");
            
            GridPane addPane = new GridPane();
            addPane.setAlignment(Pos.CENTER_LEFT);
            addPane.setHgap(10);
            addPane.setVgap(5);
            addPane.setPadding(new Insets(10));
            addPane.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, null, null))); // Set light blue background

            TextField usernameField = new TextField();
            usernameField.setPromptText("Enter Customer Username");

            TextField passwordField = new TextField();
            passwordField.setPromptText("Enter Customer Password");

            TextField balanceField = new TextField();
            balanceField.setPromptText("Enter Customer Balance");

            TextField roleField = new TextField();
            roleField.setPromptText("Enter Customer Role");
            
            AccountUsername = usernameField.getText();
            
            Label usernameLabel = new Label("Username:");
            Label passwordLabel = new Label("Password:");
            Label balanceLabel = new Label("Balance:");
            Label roleLabel = new Label("Role:");
            
            Label result = new Label();

            Button addButton = new Button("Confirm");
            
            addButton.setOnAction(event -> {
                
                if(usernameField.getText().isEmpty() || passwordField.getText().isEmpty() || roleField.getText().isEmpty() || balanceField.getText().isEmpty()){
                    result.setText("Must Enter Info");
                }
                
                else if(usernameField.getText().equals("admin")){
                    result.setText("Customer cannot be admin");
                }
               
                else{
                    String username = usernameField.getText();
                    String password = passwordField.getText();
                    double balance = Double.parseDouble(balanceField.getText());
                    String role = roleField.getText();

                    // uses account creator to make account
                    String message = manager.add(username, password, role, balance);
                    result.setText(message);
                    
                    usernameField.clear();
                    passwordField.clear();
                    balanceField.clear();
                    roleField.clear();
                }
            });
            
            addPane.add(usernameLabel, 0, 0);
            addPane.add(usernameField, 1, 0);
            addPane.add(passwordLabel, 0, 1);
            addPane.add(passwordField, 1, 1);
            addPane.add(balanceLabel, 0, 2);
            addPane.add(balanceField, 1, 2);
            addPane.add(roleLabel, 0, 3);
            addPane.add(roleField, 1, 3);
            addPane.add(addButton, 1, 4);
            addPane.add(result, 1, 5);

            Scene addCustomerScene = new Scene(addPane, 400, 300);
            addStage.setScene(addCustomerScene);
            addStage.show();
        });
        
            //delete customer button actions
            deleteCustomerButton.setOnAction(e -> {
            Stage addStage = new Stage();
            addStage.setTitle("Delete Customer");
            
            GridPane deletePane = new GridPane();
            deletePane.setAlignment(Pos.CENTER_LEFT);
            deletePane.setHgap(10);
            deletePane.setVgap(5);
            deletePane.setPadding(new Insets(10));
            deletePane.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, null, null))); // Set light blue background

            TextField usernameField = new TextField();
            usernameField.setPromptText("Enter Customer Username");
            
            AccountUsername = usernameField.getText();
            
            Label usernameLabel = new Label("Username:");
            
            Label result = new Label();

            Button deleteButton = new Button("Confirm");
            
            deleteButton.setOnAction(event -> {
                String username = usernameField.getText();

                //uses Account creator to delete account
                String message = manager.delete(username);
                result.setText(message);
                
                usernameField.clear();
            });
            
            deletePane.add(usernameLabel, 0, 0);
            deletePane.add(usernameField, 1, 0);
            deletePane.add(deleteButton, 1, 4);
            deletePane.add(result, 1, 6);

            Scene addCustomerScene = new Scene(deletePane, 400, 300);
            addStage.setScene(addCustomerScene);
            addStage.show();
        });
        
        managerPane.add(addCustomerButton, 0, 2);
        managerPane.add(deleteCustomerButton, 0, 3);
        
        logout.getChildren().addAll(logoutButton);
        
        managerPane.add(logout, 0, 4, 2, 1);

        this.scene = new Scene(managerPane, 500, 200);
    }
    
     public Scene getScene(){
        return scene;
    }
    
    public String getEnteredUsername() {
        return AccountUsername;
    }
}
