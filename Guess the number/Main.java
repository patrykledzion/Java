package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Game game = new Game();

        while(game.playAgain)
        {
            boolean guessed = false;
            int n;
            System.out.println("Give the upper limit: ");

            Scanner in = new Scanner(System.in);
            n = in.nextInt();

            if(n<3)
            {
                System.out.println("incorrect input");
                return;
            }
            game = new Game(n);

            while(!guessed)
            {
                game.tries++;
                System.out.println("Try to guess the number: ");
                int userGuess = in.nextInt();
                int check = game.Check(userGuess);
                if(check<0) System.out.println("Drawn number is less than yours!");
                else if(check>0) System.out.println("Drawn number is greater than yours!");
                else {
                    System.out.println("Congratulations. You guessed the number in "+game.tries+" tries!");
                    System.out.println("Do you want to play again (N/Y): ");
                    in.nextLine();
                    String playAgainChoice = in.nextLine();
                    System.out.println(playAgainChoice);
                    if(Objects.equals(playAgainChoice, "Y"))game.playAgain = true;
                    else if(Objects.equals(playAgainChoice, "N"))game.playAgain = false;
                    else {
                        System.out.println("incorrect input");
                        return;
                    }
                    guessed = true;

                }
            }
            System.out.println("");
        }

        System.out.println("Thank you <3!");

    }


}

