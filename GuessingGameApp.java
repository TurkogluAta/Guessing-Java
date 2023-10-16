/*
 * GuessingGameApp.java
 * author: Ata Turkoglu
 * Date: 24/03/2023
 */

import javax.swing.JOptionPane;
public class GuessingGameApp{
    public static void main(String args[]){

        //Declare variables
        int guess, secret;
        String message,ans;

        //Declare objects
        GuessingGame myGuessingGame = new GuessingGame();
        
    
        do{
            int i=1;
            do{
                //Input
                guess = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a guess 1 to 10:"));
                myGuessingGame.setGuess(guess);
                
                //Process
                myGuessingGame.compute();

                //Output
                message = myGuessingGame.getMessage();
                JOptionPane.showMessageDialog(null,message);
                secret = myGuessingGame.getSecret();
                
                i++;
            }while(i<4);
            
            JOptionPane.showMessageDialog(null,secret);
            ans = JOptionPane.showInputDialog(null,"Do you want to play again (yes/no)");
        }
        while(ans.equalsIgnoreCase("yes"));
    }
}