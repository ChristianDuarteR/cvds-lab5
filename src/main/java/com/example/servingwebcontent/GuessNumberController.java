package com.example.servingwebcontent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/guess")
public class GuessNumberController {

    private final GuessNumber guessNumber;

    @Autowired
    public GuessNumberController(GuessNumber guessNumber) {
        this.guessNumber = guessNumber;
    }

    @GetMapping
    public String showGamePage(Model model) {
        model.addAttribute("prize", guessNumber.getPrize());
        return "guess";
    }

    @PostMapping
    public String playGame(@RequestParam("numero") int userGuess, Model model) {
        int randomNumber = guessNumber.generateRandomNumber();

        if (guessNumber.checkGuess(userGuess, randomNumber)) {
            // El usuario acertó, gana el premio
            model.addAttribute("message", "¡Felicidades! Ganaste $" + guessNumber.getPrize());
        } else {
            // El usuario falló, reduce el premio en $10,000
            guessNumber.reducePrize();
            model.addAttribute("message", "Intento fallido. Tu premio actual es de $" + guessNumber.getPrize());
        }
        return "result";
    }


    @GetMapping("/reset")
    public String resetGame() {
        guessNumber.resetGame();
        return "redirect:/guess";
    }
}