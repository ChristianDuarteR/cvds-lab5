package com.example.servingwebcontent;

import org.springframework.stereotype.Service;

@Service
public class GuessNumber {

    private int prize = 100000;

    public boolean checkGuess(int userGuess, int randomNumber) {
        return userGuess == randomNumber;
    }

    public void reducePrize() {
        // Reducir el premio en $10,000
        prize -= 10000;
        // Asegurarse de que el premio nunca sea menor que cero
        if (prize < 0) {
            prize = 0;
        }
    }

    public int getPrize() {
        return prize;
    }

    public void resetGame() {
        prize = 100000;
    }

    public int generateRandomNumber() {
        return (int) (Math.random() * 10) + 1;
    }
}
