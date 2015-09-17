package businessTier;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 110310587
 */
//CASH BUTTON CLASS USED TO SELECT ITEMS FROM THE MENU
public class cashButton extends javax.swing.JButton implements Serializable {
    private double price;
    private int number;
    private int ID;
    
    public cashButton(){
        //must have a no arguments constructor to go in the Swing Palette
        
    }
  
    
    public void setPrice(double iPrice)
    {
        price = iPrice;
    }
    
    public double getPrice()
    {
        return price;
    }
    
   
    //no need for setter for text, inherited from JButton
    //only in database

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }
}

