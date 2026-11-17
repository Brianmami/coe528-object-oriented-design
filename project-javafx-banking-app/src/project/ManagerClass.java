/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author bmami
 */
public class ManagerClass extends UserAb{
    
    public ManagerClass(String user, String pass, String role){ //manager constructor
    
        //utilizing the parent constructor
    super(user, pass, role);
    }
    
    @Override
    public boolean Authenticater(){
        
        //will check if the user, pass and role match
        if(this.user.equals("admin") && this.pass.equals("admin") && this.role.equals("manager")){
            
            return true;
            
        } else{
            
            //else do not log in
            return false;
        }
    }
    
    public String add(String user, String pass, String role, double balance){
       
        //adds the new uset to a new file with a minimum balance of $100
        String fileMessage = AccountCreator.createCustomerFile(user, pass, balance + 100);
        return fileMessage;
    }
    
    public String delete(String user){
        
        //deletes the user
        String fileMessage = AccountCreator.deleteCustomer(user);
        return fileMessage;
    }
    
}
