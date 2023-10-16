/*
 * GuessingGameApp.java
 * @author: Ata Turkoglu
 * Date: 03/03/2023
 */

import javax.swing.JOptionPane;
public class GuessingGameApp{
    public static void main(String args[]){
        //Declare variables
        int secret, guess;
        String message;

        //Declare object
        GuessingGame myGuessingGame;

        //Create object
        myGuessingGame = new GuessingGame();

        //Input
        secret = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a secret number"));
        myGuessingGame.setSecret(secret);

        guess = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a guess"));
        myGuessingGame.setGuess(guess);

        //Process
        myGuessingGame.checkGuess();

        //Output
        message = myGuessingGame.getOutput();
        JOptionPane.showMessageDialog(null,message);
    }
}