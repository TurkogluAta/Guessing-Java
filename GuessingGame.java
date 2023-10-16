/*
 * GuessingGame.java
 * author: Ata Turkoglu
 * Date: 24/03/2023
 */

import java.lang.Math;
public class GuessingGame{
    //Declare data members
    private int guess;
    private int secret;
    private String message;

    //Constructor
    public GuessingGame(){
        guess = 0;
        secret = 0;
    }

    //Setters - One for every input
    public void setGuess(int guess){
        this.guess = guess;
    }

    //Compute method(s)
    public void compute(){
        secret = 1 + (int)(Math.random() * 10);
        if (secret == guess){
            message = "Congratulations, you guessed correctly!";
        }
        else if (secret < guess){
            message = "You guessed too high, sorry!";
        }
        else if ( secret > guess){
            message = "you guessed to low, sorry!";
        }
        else{
            message = "Wrong Input";
        }
    }

    //Getters
    public String getMessage(){
        return message;
    }
    public int getSecret(){
        return secret;
    }
}