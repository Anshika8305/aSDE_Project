import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void testDetermineInitialAttacker_PlayerAAttacksFirst() {
        System.out.println("testDetermineInitialAttacker_PlayerAAttacksFirstAjit");
        Player playerA = new Player(100, 10, 20);
        Player playerB = new Player(90, 8, 18);
        Game game = new Game();
        int initialAttacker = game.determineInitialAttacker(playerA, playerB);
        assertEquals(2, initialAttacker);

    }

    @Test
    void testDetermineInitialAttacker_PlayerBAttacksSecond() {
        Player playerA = new Player(90, 8, 18);
        Player playerB = new Player(100, 10, 20);
        Game game = new Game();
        int initialAttacker = game.determineInitialAttacker(playerA, playerB);
        assertEquals(1, initialAttacker);
    }
}
