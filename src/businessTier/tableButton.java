/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package businessTier;

import java.io.Serializable;

/**
 *
 * @author 110310587
 */

//TABLE BUTTON CLASS USED TO HOLD TABLE NUMBER
public class tableButton extends javax.swing.JButton implements Serializable {
    private int tableNo;
 

    /**
     * @return the tableNo
     */
    public int getTableNo() {
        return tableNo;
    }

    /**
     * @param tableNo the tableNo to set
     */
    public void setTableNo(int tableNo) {
        this.tableNo = tableNo;
    }

 
    
    
}
