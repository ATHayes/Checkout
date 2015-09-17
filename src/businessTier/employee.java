/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package businessTier;
    
/**
 *
 * @author 110310587
 */

public class employee {
    private int EMP_ID;
    private String FNAME;
    private String SNAME;

    public employee(int EMP_ID, String FNAME, String SNAME){
        this.EMP_ID = EMP_ID;
        this.FNAME = FNAME;
        this.SNAME = SNAME;
    }
   
    /**
     * @return the name
     */
    public void makeOrder(){
        
    }

    /**
     * @return the EMP_ID
     */
    public int getEMP_ID() {
        return EMP_ID;
    }

    /**
     * @param EMP_ID the EMP_ID to set
     */
    public void setEMP_ID(int EMP_ID) {
        this.EMP_ID = EMP_ID;
    }

    /**
     * @return the FNAME
     */
    public String getFNAME() {
        return FNAME;
    }

    /**
     * @param FNAME the FNAME to set
     */
    public void setFNAME(String FNAME) {
        this.FNAME = FNAME;
    }

    /**
     * @return the sNAME
     */
    public String getSNAME() {
        return SNAME;
    }

    /**
     * @param sNAME the sNAME to set
     */
    public void setsNAME(String SNAME) {
        this.SNAME = SNAME;
    }
    
    
}
