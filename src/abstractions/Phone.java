/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractions;
 
import java.util.Scanner;
/**
 *
 * @author alancerio18
 */
public class Phone {
    public static void main(String[] args) {
     Scanner keyBoard = new Scanner(System.in);
      
     System.out.println("Enter in a G,O, or and H");
        char input = keyBoard.next(".").charAt(0);
        
       Galaxys6 galaxy = new Galaxys6("Galaxys6");
       HtcOne  htc = new HtcOne("HTC One");
       OneplusOne one = new OneplusOne("OnePlus One");
       
        if(input == 'G' ){
            System.out.println("You put in " + input + " " + "so you have the " + galaxy.getGalaxy());
        }else if(input == 'H'){
        System.out.println("You put in " + input + " " + "so you have the " + htc.getHtc());
    }else if (input == 'O'){
        System.out.println("You put in " + input + " " + "so you have the " + one.getOneplusOne());
    }
        
    }
    
}
