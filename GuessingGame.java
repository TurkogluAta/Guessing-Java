/*
 * GuessingGame.java
 * @author: Ata Turkoglu
 * Date: 03/03/2023
 */

public class GuessingGame{
    //Declare data members
    private int secret;
    private int guess;
    private String message;

    //Constructor 
    public GuessingGame(){
        secret = 0;
        guess = 0;
        message = "";
    }

    //Setters - One for every input
    public void setSecret(int secret){
        this.secret = secret;
    }
    public void setGuess(int guess){
        this.guess = guess;
    }

    //Compute method(s)
    public void checkGuess(){
        if(guess == secret){
            message = "Perfect!";
        }
        else if(guess > secret){
            message = "Too high!";
        }
        else if(guess < secret){
            message = "Too low!";
        }
    }

    //Getters - One for every output
    public String getOutput(){
        return message;
    }
}