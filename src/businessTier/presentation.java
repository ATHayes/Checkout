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
public class presentation {
    
    //to proper case method - adapted from http://forums.whirlpool.net.au/archive/820362
    public static String toProperCase(String name)
    {
     if (name == null) {
    return name;
    }

    name = name.toLowerCase();
    char[] charArray = name.toCharArray();
    charArray[0] = Character.toUpperCase(charArray[0]);
    return new String(charArray);
    }
    
}
