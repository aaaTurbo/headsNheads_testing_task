package ru.aaaTurbo;

import ru.aaaTurbo.entities.Fight;
import ru.aaaTurbo.entities.Monster;
import ru.aaaTurbo.entities.Player;


public class Main {
    public static void main(String[] args) {
        try {
            Fight fight = new Fight(
                    new Player("Player", 27, 17, 24, 7, 4),
                    new Monster("Monster", 30, 25, 16, 10, 6));
            fight.run();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}