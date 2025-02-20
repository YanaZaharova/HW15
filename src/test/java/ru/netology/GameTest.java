package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    public void firstPlayerWins() {
        Player kate = new Player("Катя", 34562, 17_000);
        Player andrew = new Player("Андрей", 78653, 15_800);
        Game game = new Game();

        game.register(kate);
        game.register(andrew);

        int expected = 1;
        int actual = game.round("Катя", "Андрей");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void secondPlayerWins() {
        Player kate = new Player("Катя", 34562, 14_000);
        Player andrew = new Player("Андрей", 78653, 15_800);
        Game game = new Game();

        game.register(kate);
        game.register(andrew);

        int expected = 2;
        int actual = game.round("Катя", "Андрей");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameEndsWithADraw() {
        Player kate = new Player("Катя", 34562, 16_500);
        Player andrew = new Player("Андрей", 78653, 16_500);
        Game game = new Game();

        game.register(kate);
        game.register(andrew);

        int expected = 0;
        int actual = game.round("Катя", "Андрей");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void firstPlayerIsNotRegistered() {
        Player kate = new Player("Катя", 34562, 16_500);
        Player andrew = new Player("Андрей", 78653, 16_500);
        Game game = new Game();

        game.register(andrew);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Катя", "Андрей");
        });
    }

    @Test
    public void secondPlayerIsNotRegistered() {
        Player kate = new Player("Катя", 34562, 16_500);
        Player andrew = new Player("Андрей", 78653, 16_500);
        Game game = new Game();

        game.register(kate);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Катя", "Андрей");
        });
    }
}
