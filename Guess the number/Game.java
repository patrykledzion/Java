package com.company;


import java.util.Random;

public class Game {
    private int number;
    final private int n;
    public boolean playAgain;
    public int tries;

    public Game()
    {
        this.n = 0;
        this.playAgain = true;
        this.tries = 0;
    }

    public Game(int n)
    {
        this.n = n;
        this.playAgain = true;
        this.tries = 0;
        Draw();
    }

    private void Draw()
    {
        Random rand = new Random();
        number = rand.nextInt(this.n);
    }

    public int Check(int given)
    {
        return number-given;
    }
}
