package launcher;

import gui.SimplePresentationScreen;
import entities.*;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	SimplePresentationScreen gui=new SimplePresentationScreen(new Student(131485,
            			"Juan Ignacio",
            			"Ferrari Destéffaniz",
            			"juanignacioferraridesteffaniz@gmail.com",
            			"https://github.com/JuanIgFerrariDes",
            			"/images/foto.png"));
            }
        });
    }
}