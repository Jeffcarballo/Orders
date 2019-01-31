/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;


/**
 *
 * @author Jeff
 */
public class Orders {
    private String name;
    private String address;
    private double pounds;
    
 public Orders(String name, String address, double pounds){
        
        this.name = name;            
        this.address = address;
        this.pounds = pounds;

    }
   
 //setters and getters
    
    public String getName() {return name;}
    
    public void setName(String name) {          
        
        this.name = name;
        
    }
    
    public String getAddress() {return address;}
    
    public void setAddress(String address) {

        this.address = address;
        
    }
    
    public double getPounds() {return pounds;}
    
    public void setPounds(double pounds) {

        this.pounds = pounds;
        
    }
    
} 
    

