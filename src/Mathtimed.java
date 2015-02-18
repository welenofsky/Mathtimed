/**
 * @(#)Mathtimed.java
 *
 * Mathtimed application
 *
 * @author Justin Welenofsky
 * @version 1.00 2008/12/11
 */

public class Mathtimed {
	static boolean play = true;
	public static void setPlay(){
		play = false;
	}
	

    public static void main(String[] args) {
    Mathproc game = new Mathproc();
    int x = 0;
    while(play){
    	if(x <= 15){
    	TimerP time= new TimerP(15);
    	game.setX();
   	    game.setY();
   	    game.setArith();
    	game.Mathrun();
    	x++;
    	}
     }
     game.PC();
    }
}
