/*
 * To change this license header, choose License Headers in Project Properties.
 */
//Splashsreen code apapted from http://wiki.netbeans.org/Splash_Screen_Beginner_Tutorial#Step_by_Step

package presentationTier;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.SplashScreen;
import java.awt.geom.Rectangle2D;
/**
 *
 * @author 113453272
 */
public class Splashscreen {
    
    static SplashScreen mySplash;                   // instantiated by JVM we use it to get graphics
    static Graphics2D splashGraphics;               // graphics context for overlay of the splash image
    static Rectangle2D.Double splashTextArea;       // area where we draw the text
    static Rectangle2D.Double splashProgressArea;   // area where we draw the progress bar
    static Font font;                               // used to draw our text

    public static void main(String[] args)
    {
        splashInit();           // initialize splash overlay drawing parameters
        appInit();              // simulate what an application would do before starting
        new frmWelcome().setVisible(true); // Displays welcome form
        
        
        //if (mySplash != null)   // check if we really had a spash screen
            //mySplash.close();   // we're done with it
        
        // begin with the interactive portion of the program
        
    }
    /**
     * just a stub to simulate a long initialisation task that updates
     * the text and progress parts of the status in the Splash
     */
    private static void appInit()
    {
        for (int i = 1; i <= 10; i++)
        {   // pretend we have 10 things to do
            int pctDone = i * 10;       // this is about the only time I could calculate rather than guess progress
            splashProgress(pctDone);            // give them an idea how much we have completed
            try
            {
                Thread.sleep(100);             // wait a second
            }
            catch (InterruptedException ex)
            {
                break;
            }
        }
         
    }

    /**
     * Prepare the global variables for the other splash functions
     */
    private static void splashInit()
    {
        // the splash screen object is created by the JVM, if it is displaying a splash image
        
        mySplash = SplashScreen.getSplashScreen();
        // if there are any problems displaying the splash image
        // the call to getSplashScreen will returned null

        if (mySplash != null)
        {
            // get the size of the image now being displayed
            Dimension ssDim = mySplash.getSize();
            int height = ssDim.height;
            int width = ssDim.width;

            // stake out some area for our status information
            splashTextArea = new Rectangle2D.Double(15., height*0.88, width * .45, 32.);
            splashProgressArea = new Rectangle2D.Double(width * .55, height*.92, width*.4, 12 );

            // create the Graphics environment for drawing status info
            splashGraphics = mySplash.createGraphics();
            

            // initialize the status info
           
        }
        
    }
    /**
     * Display text in status area of Splash.  Note: no validation it will fit.
     * @param str - text to be displayed
     */
    
    /**
     * Display a (very) basic progress bar
     * @param pct how much of the progress bar to display 0-100
     */
    public static void splashProgress(int pct)
    {
        if (mySplash != null && mySplash.isVisible())
        {

            // Note: 3 colors are used here to demonstrate steps
            // erase the old one
            splashGraphics.setPaint(Color.WHITE);
            splashGraphics.fill(splashProgressArea);

            // draw an outline
            splashGraphics.setPaint(Color.LIGHT_GRAY);
            splashGraphics.draw(splashProgressArea);

            // Calculate the width corresponding to the correct percentage
            int x = (int) splashProgressArea.getMinX();
            int y = (int) splashProgressArea.getMinY();
            int wid = (int) splashProgressArea.getWidth();
            int hgt = (int) splashProgressArea.getHeight();

            int doneWidth = Math.round(pct*wid/100.f);
            doneWidth = Math.max(0, Math.min(doneWidth, wid-1));  // limit 0-width

            // fill the done part one pixel smaller than the outline
            splashGraphics.setPaint(Color.RED);
            splashGraphics.fillRect(x, y+1, doneWidth, hgt-1);

            // make sure it's displayed
            mySplash.update();
        }
        
        
    }
}

